package Hero;


//This is the database helper which get data from dto and hero class
public class DBHelperConverter
{


    // this is the static class for creating dto

    //Here we are moving from dtHero(Class) to hero(Class)
  public static dtoHero dtoHero (Hero hero)
  {
      final dtoHero dtoHero = new dtoHero();

      //dtoHero.setId(hero.getId());
      dtoHero.setId(hero.getId());
      dtoHero.setName(hero.getName());



      return dtoHero;

  }

  // so now we are moving from the Hero(Class) to dtoHero(Class)

    public static Hero name(dtoHero dtoHero)
    {
      final Hero hero = new Hero();
      hero.setId(dtoHero.getId());
      hero.setName(dtoHero.getName());
      return hero;
    }


    //then we go back to the services class to save the information in the database


}

