import org.openqa.selenium.{Platform, WebDriver}
import org.openqa.selenium.firefox.{FirefoxBinary, FirefoxDriver, FirefoxOptions, FirefoxProfile}
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.scalatest.{FlatSpec, MustMatchers}
import org.scalatest.selenium.WebBrowser
import org.scalatestplus.play.{OneBrowserPerSuite, OneServerPerSuite}

class BlogSpec extends FlatSpec with MustMatchers with WebBrowser {

  System.setProperty("webdriver.gecko.driver","/home/odendm/tmp/geckodriver")
  println("\n\n\n\nline 12 before webdriver\n\n\n\n")
  implicit val webDriver: WebDriver = new FirefoxDriver()
  println("\n\n\n\nline 14 after webdriver\n\n\n\n")
//  System.setProperty("webdriver.gecko.driver","/home/jonsnow/tmp/geckodriver")
//  val ffdesired = DesiredCapabilities.firefox()
//  ffdesired.setCapability("marionette", true)
//  implicit val webDriver: WebDriver = new FirefoxDriver(ffdesired)
////  val binary = new FirefoxBinary(new java.io.File("/usr/bin/firefox"))

//  System.setProperty("webdriver.gecko.driver","/home/jonsnow/tmp/geckodriver")
//  val binPath = "/usr/bin/firefox"
//  val firefox : FirefoxBinary = new FirefoxBinary()
//  val firefoxOptions : FirefoxOptions = new FirefoxOptions()
//  firefoxOptions.setBinary(firefox)
//  firefox.addCommandLineOptions("-headless")
//  val caps : DesiredCapabilities = new DesiredCapabilities()
//  caps.setJavascriptEnabled(true)
//  caps.setAcceptInsecureCerts(true)
//  caps.setCapability(FirefoxDriver.BINARY, "--headless")
//  caps.setCapability(
//    FirefoxDriver.BINARY,
//    Array(
//      "browserName", "firefox",
//      "acceptSslCerts", true,
//      "javascriptEnabled", true,
//      "takesScreenshot", false,
//      "firefox_profile", "",
//      "browser-version", "27",
//      "platform", "LINUX",
//      "maxInstances", 1,
//      "firefox_binary", binPath,
//      "cleanSession", true ))
//
//  caps.setCapability("marionette",false)
//  caps.setCapability(FirefoxDriver.BINARY, binPath)
//  caps.setCapability(FirefoxDriver.MARIONETTE, firefox)
//  caps.setPlatform(Platform.LINUX)
//  caps.setBrowserName("firefox")
//  val firefoxProfile : FirefoxProfile = new FirefoxProfile()
//  val firefoxNewOptions= firefoxOptions.setBinary(firefox)
//  val firefoxDriver= new FirefoxDriver(firefoxNewOptions)
//  println(s"Starting firefox with version ${firefoxDriver.getCapabilities.getVersion}")
//  implicit val webDriver: WebDriver = firefoxDriver

  val host = "https://www.google.com/"

  "The blog app home page" should "have the correct title" in {
    go to (host)
    pageTitle mustBe ("Google")
  }

}

