package ex1_aula5;

public class Relogio {
    private int hora, min, seg;

    public int getHora(){
        return hora;
    }
    
    public void setHora(int hora){
        if(hora >= 0 && hora < 24)
            this.hora = hora;
    }
    
    public int getMin(){
        return min;
    }
    
    public void setMin(int min){
        if(min >= 0 && min < 60)
            this.min = min;
    }
    
    public int getSeg(){
        return seg;
    }
    
    public void setSeg(int seg){
        if(seg >= 0 && seg < 60)
            this.seg = seg;
    }
    public Relogio(int hora, int min, int seg){
        if(hora >= 0 && hora < 24)
            this.hora = hora;
        else
            this.hora = 0;
        
        if(min >= 0 && min < 60)
            this.min = min;
        else
            this.min = 0;
        
        if(seg >= 0 && seg < 60)
            this.seg = seg;
        else
            this.seg = 0;
    }
    
    public void exibir(){
        System.out.println(hora + ":" + min + ":" + seg);
    }
}
