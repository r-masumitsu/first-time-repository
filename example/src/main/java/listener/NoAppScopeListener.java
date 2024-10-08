package listener;

import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class NoAppScopeListener
 *
 */
@WebListener
public class NoAppScopeListener implements ServletContextAttributeListener {
//警告が表示されないようにコメントアウト
//	public void attributeAdded(ServletContextAttributeEvent scae) {
//		System.out.println("警告：格納は禁止されています");
//	}
//	public void attributeRemoved(ServletContextAttributeEvent scae) {}
//	public void attibuteReplaced(ServletContextAttributeEvent scae) {}
}
