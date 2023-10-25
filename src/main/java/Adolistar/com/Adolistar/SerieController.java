package Adolistar.com.Adolistar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @GetMapping
    public List<Serie> listar(){
        List<Serie> lista= new ArrayList<>();
        lista.add(new Serie("Breaking Bad", "Drama", 2008));
        lista.add(new Serie("Game of Thrones", "Aventura", 2011));
        lista.add(new Serie("Round 6", "Ação", 2022));
        return lista;
    }
}
