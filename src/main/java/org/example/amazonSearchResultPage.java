package org.example;

import org.openqa.selenium.By;

public class amazonSearchResultPage {
    By thirdProduct = By.xpath("//img[@src='https://m.media-amazon.com/images/I/61g5Msog0EL._AC_UL320_.jpg']");
    By fouthPrice = By.xpath("//span[normalize-space()='1,227,960']");
    By secondPrice = By.xpath("//span[normalize-space()='1,177,818']");
    By searchBox = By.xpath("//input[@role='searchbox']");
    By cart = By.xpath("//a[@href='/gp/cart/view.html?ref_=nav_cart']");
    By todayDeals = By.xpath("//a[contains(text(),'s Deals')]");
    By addtocart1 = By.id("a-autoid-1-announce");
    By secondProdName = By.xpath("//h2[@aria-label='Men's Runfalcon 6']");
    By boughtInPastMonth = By.xpath(
            "(//div[@data-cy='asin-faceout-container'])[1]//span[contains(text(),'bought in past month')]"
    );
    By productBrand1 = By.xpath(
            "(//div[@data-cy='asin-faceout-container'])[1]//span[text()='adidas']"
    );
    By textResult = By.xpath("//div[@class='s-no-outline']//h2[contains(text(),'Result')]");
    By manCheckbox = By.id("p_n_g-101015233022111/121075132011");
    By resultBar = By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']");
    By seeMoreButton = By.xpath("//a[@aria-label='See more']");







}
