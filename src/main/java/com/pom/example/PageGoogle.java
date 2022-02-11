package com.pom.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass.selenium.SeleniumSimpleWebDriverManager;
import com.relevantcodes.extentreports.LogStatus;

public class PageGoogle {

	protected WebDriver driver;
	private By gmailLink = By.xpath("(//*[@class='gb_d'])[1]");
	private By imagesLink = By.xpath("(//*[@class='gb_d'])[2]");

	static final Logger logger = LogManager.getLogger(PageGoogle.class);

	public PageGoogle(WebDriver driver) {
		this.driver = driver;
//		if (!driver.getTitle().equals("Google")) {
//			logger.error("Google Title pass");
//			throw new IllegalStateException(
//					"This is not Home Page of logged in user," + " current page is: " + driver.getCurrentUrl());
//		} else {
//			logger.info("Google Title pass");
//		}

	}

	/**
	 * Get message (h1 tag)
	 *
	 * @return String message text
	 */
	public String getMessageText() {

		String title = driver.getTitle();
		logger.info("title is " + title);
		return title;
	}

	public PageGoogle manageProfile() {
		// Page encapsulation to manage profile functionality
		return new PageGoogle(driver);
	}
	/*
	 * More methods offering the services represented by Home Page of Logged User.
	 * These methods in turn might return more Page Objects for example click on
	 * Compose mail button could return ComposeMail class object
	 */

	public String checkGmailLink() {
		return driver.findElement(gmailLink).getText();

	}

	public String checkImagesLink() {
		return driver.findElement(imagesLink).getText();	
	}
	
	
	
	//**************************************************************************
	public String checkNewsLink() {
		return driver.findElement(By.xpath("(//*[@class='orb-nav-newsdotcom'])[1]")).getText();
	}
	
	public String checkSportLink() {
		return driver.findElement(By.xpath("(//*[@class='orb-nav-sport'])")).getText();	
	}
	
	public String checkReelLink() {
		return driver.findElement(By.className("orb-nav-reeldotcom")).getText();	
	}
	
	public String checkWorklifeLink() {
		return driver.findElement(By.className("orb-nav-worklife")).getText();
	}
	
	public String checkTravelLink() {
		return driver.findElement(By.xpath("(//*[@class='orb-nav-traveldotcom'])")).getText();
	}
	
	public String checkFutureLink() {
		return driver.findElement(By.xpath("(//*[@class='orb-nav-future'])")).getText();
	}
	
	public String checkCultureLink() {
		return driver.findElement(By.className("orb-nav-culture")).getText();
	}
	
	public String checkHomeLink() {
		return driver.findElement(By.xpath("(//*[@class='orb-nav-section orb-nav-blocks'])")).getText();
	}
	
	public String checkMoreLanguagesLink() {
		return driver.findElement(By.className("ws-languages__link")).getText();
	}
	
	public String checkLanguagesLink() {
		return driver.findElement(By.xpath("(//*[@class='module__title__link'])")).getText();
	}
	
	public String checkArabicLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[1]")).getText();
	}
	
	public String checkChineseLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[5]")).getText();
	}
	
	public String checkIndonesianLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[9]")).getText();
	}
	
	public String checkKyrgyzLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[13]")).getText();
	}
	
	public String checkPersianLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[17]")).getText();
	}
	
	public String checkSomaliLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[21]")).getText();
	}
	
	public String checkTurkishLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[25]")).getText();
	}
	
	public String checkVietnameseLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[29]")).getText();
	}
	
	public String checkAzeriLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[2]")).getText();
	}
	
	public String checkFrenchLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[6]")).getText();
	}
	
	public String checkJapaneseLink() {
		return driver.findElement(By.xpath("(//*[@class='ws-language__english'])[10]")).getText();
	}
}
