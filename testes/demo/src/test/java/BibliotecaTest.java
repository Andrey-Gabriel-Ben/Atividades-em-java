import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 
import com.example.Biblioteca;

class Bibliotecatest {
    
    @Test
    private void DeveEmprestarQuandoHouverLivrosDisponiveis(){
        Biblioteca b = new Biblioteca();

        int qtdDisponivel = 20;

        boolean result = b.empretarlivros(qtdDisponivel);

        assertTrue(result);
    }
    
    @Test
    private void naoDeveEmprestarLivrosQuandoNaoHouverDisponiveis(){
        Biblioteca b = new Biblioteca();

        int qtdDisponivel = 0;

        boolean result = b.empretarlivros(qtdDisponivel);

        assertFalse(result);
    }

    @Test
    private void naoDeveEmprestarLivrosQuandoQTDDisponivelForNegativa(){
        Biblioteca b = new Biblioteca();

        int qtdDisponivel = -10;

        boolean result = b.empretarlivros(qtdDisponivel);

        assertFalse(result);
    }
    
    @Test 
    private void deveDiminuirAQuantidadeDisponivelAoEmprestarLivros(){
        Biblioteca b = new Biblioteca();

        int qtdDisponivel = 20;

        b.empretarlivros(qtdDisponivel);
        b.empretarlivros(qtdDisponivel);
        b.empretarlivros(qtdDisponivel);
        b.empretarlivros(qtdDisponivel);
        b.empretarlivros(qtdDisponivel);

        int result = qtdDisponivel;

        assertEquals(15, result);
    }

    //Também deveria exibir mensagens de sucesso, mas não vou testar isso, pois é um código bem básico visando aprender os fundamentos básicos do JUnit.

}


/*

 

*/