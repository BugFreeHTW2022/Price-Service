package htw.kbe.priceservice;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {


    int id;
    String name;
    Component size;
    Component dough;
    Component fill;
    Component glasur;
    Component extras;



}


