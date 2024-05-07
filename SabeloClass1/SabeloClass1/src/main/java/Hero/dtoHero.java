package Hero;


import lombok.Builder;

import java.io.Serializable;

//The data transfer object must look like the class  it must extend serialisation
@Builder
public class dtoHero implements Serializable
{
   private long id;
   private String name;

   public dtoHero()
   {

   }
   public  dtoHero( long id,String name)
   {
     this.id = id;
     this.name=name;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
