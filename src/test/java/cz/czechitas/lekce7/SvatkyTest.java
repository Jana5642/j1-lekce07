package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

  /**
   * Testuje metodu {@link Svatky#kdyMaSvatek(String)}
   */
  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
    assertNull(svatky.kdyMaSvatek("difuhwpiefu"));
  }

  /**
   * Testuje metodu {@link Svatky#jeVSeznamu(String)}
   */
  @Test
  void jeVSeznamu() {
    //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
    Svatky svatky = new Svatky();
    assertTrue(svatky.jeVSeznamu("Nataša"));
    assertFalse(svatky.jeVSeznamu("Eva"));
    assertFalse(svatky.jeVSeznamu("difuhwpiefu"));
  }

  /**
   * Testuje metodu {@link Svatky#getPocetJmen()}
   */
  @Test
  void getPocetJmen() {
    //TODO Otestovat, že vrací počet jmen, která máme v seznamu
    Svatky svatky = new Svatky();
    assertNotNull(svatky.getPocetJmen());
    assertEquals(37,svatky.getPocetJmen());
  }

  /**
   * Testuje metodu {@link Svatky#getSeznamJmen()}
   */
  @Test
  void getSeznamJmen() {
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
    Svatky svatky = new Svatky();
    svatky.getSeznamJmen();
    assertEquals(37,svatky.getPocetJmen());
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, int)}
   */
  @Test
  void pridatSvatekDenMesicInt() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Kamila",9,5);
    assertEquals(MonthDay.of(5, 9), svatky.kdyMaSvatek("Kamila"));
    assertTrue(svatky.jeVSeznamu("Kamila"));
    assertFalse(svatky.jeVSeznamu("Tamara"));
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, Month)}
   */
  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Marie",12,5);
    assertEquals(MonthDay.of(5, 12), svatky.kdyMaSvatek("Marie"));
    assertTrue(svatky.jeVSeznamu("Marie"));
    assertFalse(svatky.jeVSeznamu("Lenka"));
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, MonthDay)}
   */
  @Test
  void prridatSvatekMonthDay() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Laura",18,5);
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Laura"));
    assertTrue(svatky.jeVSeznamu("Laura"));
    assertFalse(svatky.jeVSeznamu("Diana"));
  }

  /**
   * Testuje metodu {@link Svatky#smazatSvatek(String)}
   */
  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
    Svatky svatky = new Svatky();
    svatky.smazatSvatek("Svatava");
    assertEquals(36,svatky.getPocetJmen());
  }
}
