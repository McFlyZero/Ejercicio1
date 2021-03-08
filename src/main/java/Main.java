import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //Establecemos la propiedad webdriver.chrome.driver con la ubicación del chrome driver que descargamos
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artur\\OneDrive\\Escritorio\\chromedriver.exe");

        //Creamos una nueva instancia del chrome driver
        WebDriver driver = new ChromeDriver();

        //Hacemos una llamada a esta página
        driver.get("https://www.google.com");

        //Buscamos por nombre la entrada de texto
        WebElement element = driver.findElement(By.name("q"));

        //Ingresamos un texto a buscar
        element.sendKeys("Cheese!");

        //Enviamos la forma
        element.submit();

        //Cerramos el navegador
        //driver.quit();
    }
}

