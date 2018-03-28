import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.{FlatSpec, MustMatchers}
import org.scalatest.selenium.WebBrowser
import org.scalatestplus.play.{OneBrowserPerSuite, OneServerPerSuite}

class BlogSpec extends FlatSpec with MustMatchers
  with OneServerPerSuite
  with OneBrowserPerSuite {

  System.setProperty("webdriver.gecko.driver","/home/odendm/tmp/geckodriver")
  override implicit val webDriver: WebDriver = new FirefoxDriver()



  val host = "https://www.google.com/"

  "The blog app home page" should "have the correct title" in {
    go to (host)
    pageTitle mustBe ("Google")
  }

}

