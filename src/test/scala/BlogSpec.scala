import org.openqa.selenium.{Platform, WebDriver}
import org.openqa.selenium.firefox.{FirefoxBinary, FirefoxDriver, FirefoxOptions, FirefoxProfile}
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.scalatest.{FlatSpec, MustMatchers}
import org.scalatest.selenium.WebBrowser
import org.scalatestplus.play.{OneBrowserPerSuite, OneServerPerSuite}

class BlogSpec extends FlatSpec with MustMatchers with WebBrowser {

  System.setProperty("webdriver.gecko.driver","/home/jonsnow/tmp/geckodriver")
  implicit val webDriver: WebDriver = new FirefoxDriver()

  val host = "https://www.google.com/"

  "The blog app home page" should "have the correct title" in {
    go to (host)
    pageTitle mustBe ("Google")
  }

}

