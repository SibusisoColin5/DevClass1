package Hero;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("hero")
public class HeroController
{
    private final ServiceHero serviceHero;

    public HeroController(ServiceHero serviceHero1)
    {
        this.serviceHero = serviceHero1;
    }

//    @PostMapping()
//    public ResponseEntity<dtoHero> create(@RequestBody dtoHero i)
//    {
//        return ResponseEntity.ok(serviceHero.);
//      //  return ResponseEntity.of(serviceHero.create();
//    }

    @GetMapping()
    public List<dtoHero> get()
    {
        return serviceHero.dtoHeroList();
    }



    @PutMapping()
    public ResponseEntity<dtoHero> create(@PathVariable() long id ,@RequestBody dtoHero hero){
        return null;
    }
    @DeleteMapping()
    public void create(@PathVariable() long id )
    {

    }


}
