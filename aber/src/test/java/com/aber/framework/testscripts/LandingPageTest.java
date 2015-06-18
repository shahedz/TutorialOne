package com.aber.framework.testscripts;

import org.testng.annotations.Test;

import com.aber.framework.mainscript.BaseScript;

public class LandingPageTest extends BaseScript{

	 @Test
	 public void test1() throws InterruptedException{
		 System.out.println("test");
		 Thread.sleep(200);
		 landingPageController.closeDialogBox();
		 Thread.sleep(200);
		 landingPageController.mouseOverToSignIn();
	 }
}
