public class Lingua {
    public String falar;
    public String anodecriacao;
    
    public Lingua(String _falar, String _anodecriacao){
        this.falar = _falar;
        this.anodecriacao = _anodecriacao;   
    }  
}




public class Portugues extends Lingua {
    public Portugues(String _falar, String _anodecriacao){
        super(_falar,_anodecriacao);
    }   
}


public class Main {
    public static void main (String [] args){
        Portugues x = new Portugues("Estou falando Portugues, sou Junior", "Seculo 13");
        System.out.println("Falou: " + x.falar);
        System.out.println("Ano de criação da Lingua: " + x.anodecriacao);
        
    }  
}
