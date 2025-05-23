package galaxy.app.reservation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EndTimeMustBeAfterStartTimeValidator implements ConstraintValidator<EndTimeMustBeAfterStartTime, ReservationForm> {
	
	private String message;
	
	@Override
	public void initialize(EndTimeMustBeAfterStartTime constraintAnnotation) {
		message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(ReservationForm value, ConstraintValidatorContext context) {
		if (value.getCreateStartTime() == null || value.getCreateEndTime() == null) {
			return true;
		}
		boolean isEndTimeMustBeAfterStartTime = value.getCreateEndTime().isAfter(value.getCreateStartTime());
		if (!isEndTimeMustBeAfterStartTime) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message).addPropertyNode("endMinute").addConstraintViolation();
		}
		return isEndTimeMustBeAfterStartTime;
	}
	
}