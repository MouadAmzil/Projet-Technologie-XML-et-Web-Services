package test.ziad;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Releve {
    public List<Operation> operations= new ArrayList<>();
}

