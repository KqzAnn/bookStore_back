package bookstore.models.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.*;
import java.io.Serializable;

@Embeddable
public class OrderBookID implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private Orders order;


    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Book book;


}