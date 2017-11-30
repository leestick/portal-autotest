package comita.auto.selenium.tests.scripts.authorization;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comita.auto.selenium.base.TestBase;
import comita.auto.selenium.model.User;

public class LoginUser extends TestBase {
	
	@BeforeMethod
	public void setUp(){		
		video.startRecording(app.getWebDriver());
	}
	
	@Test
	public void testLoginUserOK() throws InterruptedException{		
		try{
			log.AppendToFile("---testLoginUserOK---");
			User user = new User().setLogin("bumaga").setPassword("12345678");	
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(user);
			assertTrue("Не осуществлен вход в личный кабинет!", app.getUserHelper().isLoggedIn());
			app.getUserHelper().logout();
		}
		finally {
			video.stopRecording("testLoginUserOK");
		}
	}
	
	@Test
	public void testLoginUserOKManyTimes() throws InterruptedException {
		try{
			log.AppendToFile("---testLoginUserOKManyTimes---");
			User user = new User().setLogin("bumaga").setPassword("12345678");
			//далее начинается цикл, количество повторений в котором можно изменить на необходимое
			for (int i = 0; i < 100; i++) {				
				System.out.println(i);
				app.getNavigationHelper().openLoginPage();
				app.getUserHelper().loginAs(user);
				assertTrue("Не осуществлен вход в личный кабинет!", app.getUserHelper().isLoggedIn());
				Thread.sleep(5000); //при необходимости задержки
				app.getUserHelper().logout();
			}			
		}
		finally {
			video.stopRecording("testLoginUserOKManyTimes");
		}
	}
	
	@Test
	public void testIncorrectLoginPass() throws InterruptedException{		
		try{
			log.AppendToFile("---testIncorrectLoginPass---");
			User user = new User().setLogin("incorrect").setPassword("12345678");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(user);
			assertTrue("Некорректное сообщение при неверных данных для входа!", app.getUserHelper().isIncorrectLoginPass());
		}
		finally {
			video.stopRecording("testIncorrectLoginPass");
		}
	}
	
	@Test
	public void testOutLoginPass() throws InterruptedException{		
		try{
			log.AppendToFile("---testOutLoginPass---");
			User user = new User().setLogin("").setPassword("");
			app.getNavigationHelper().openLoginPage();
			app.getUserHelper().loginAs(user);
			assertTrue("Некорректное сообщение при отсутствии данных для входа!", app.getUserHelper().isIncorrectLoginPass());
		}
		finally {
			video.stopRecording("testOutLoginPass");
		}
	}

}
