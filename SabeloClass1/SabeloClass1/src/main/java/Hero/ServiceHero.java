package Hero;

import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Hero.DBHelperConverter.dtoHero;
import static Hero.DBHelperConverter.name;

@Service
public class ServiceHero
{

    private final HeroRepository heroRepository;

    @Autowired
   // @GeneratedValue(generator = )
    public ServiceHero (HeroRepository heroRepository)
    {

        this.heroRepository = heroRepository;
    }

    public dtoHero create(dtoHero dtohero) throws Exception
    {
        // remember this is from the
      final Hero save = name(dtohero);

      try {
          var result = heroRepository.save(save);
          var savesave = dtoHero (result);
          return savesave;
      }catch ( Exception e)
      {
          throw new Exception("");
      }
    }

    public List<dtoHero> dtoHeroList()
    {
      final List<dtoHero> dtoHeroes = new ArrayList<>();

      final List<Hero> heroes = heroRepository.findAll();

      for (Hero hero:heroes)
      {
          final dtoHero dtoHero = dtoHero(hero);


          dtoHeroes.add(dtoHero);
      }
      return dtoHeroes;


        //Another way we can use java stream library
       //return heroRepository.findAll().stream().map(hero -> name(Hero).collect(Collectors.toList());
    }

    public dtoHero updateHero(long id,dtoHero dtoHero)
    {
        return dtoHero;
    }

    public void DeleteHero(long id)
    {

    }
}
