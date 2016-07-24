package head.first.java.v2.chap18;

import javax.swing.*;
import java.io.Serializable;

public interface Service extends Serializable {
    JPanel getGuiPanel();
}