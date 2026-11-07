package org.example;

import org.openqa.selenium.By;

public class airbnbHomePage {
    By logoIMG = By.xpath("//img[@src='/static/media/logo_c.7d3a295d07cb09e98104.png']");
    By home = By.xpath("//a[normalize-space()='Home']");
    By about = By.xpath("//a[normalize-space()='About']");
    By userLogo = By.xpath("//img[@src='https://cdn-icons-png.flaticon.com/512/6596/6596121.png']");
    By location = By.xpath("//p[normalize-space()='Địa điểm']");
    By timeLocation = By.xpath("//div[contains(@class,'col-span-4') and contains(@class,'cursor-pointer')]");
    By addCustomer = By.xpath("//div[contains(@class,'gap-3') and contains(@class,'cursor-pointer')]");
    By minusButton = By.xpath("//button[contains(@class,'font-bold') and contains(@class,'rounded-full') and contains(@class,'FF5A5F')][1]");
    By plusButton = By.xpath("//button[contains(@class,'font-bold') and contains(@class,'rounded-full') and contains(@class,'FF5A5F')][2]");
    By hcmCard = By.xpath("//a[@href='/rooms/ho-chi-minh']//div[@class='flex items-center gap-3']");
    By canTho = By.xpath("//h2[normalize-space()='Cần Thơ']");
    By loaiNoiO = By.xpath("//button[normalize-space()='Loại nơi ở']");
    By gia = By.xpath("//button[normalize-space()='Giá']");
    By laixe = By.xpath("//p[normalize-space()='6.5 giờ lái xe']");





}
