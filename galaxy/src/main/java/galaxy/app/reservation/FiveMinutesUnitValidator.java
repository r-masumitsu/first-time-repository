package galaxy.app.reservation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FiveMinutesUnitValidator implements ConstraintValidator<FiveMinutesUnit, String> {
	
	@Override
	public void initialize(FiveMinutesUnit constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}
		return Integer.parseInt(value) % 5 == 0;
	}
	
}