import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private  int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom){
        this.szerzo=szerzo;
        this.tartalom= tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();


    }

    public String getSzerzo(){
        return this.szerzo;
    }

    public String getTratalom(){
        return this.tartalom;
    }
    public void setTartalom(String tartalom){
        this.szerkesztve = LocalDateTime.now();
        this.tartalom = tartalom;
    }
    public int getLikeok(){
        return this.likeok;
    }
    public LocalDateTime getLetrejott(){
        return this.szerkesztve;
    }
    public LocalDateTime getSzerkesztve(){
        return this.szerkesztve;
    }
    public void like(){
        this.likeok++;
    }


}
