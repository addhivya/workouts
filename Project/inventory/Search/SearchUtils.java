package Project.inventory.Search;

import Project.inventory.interfaces.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class SearchUtils {

    static void populateInternalFields(List<Vehicle> vehicleList, List<String> ... lists) {

        for (List<String> list : lists) {
            list.add("No Preference");
        }
        vehicleList.forEach(vehicle -> {
            lists[0].add(vehicle.getId());
            lists[1].add(vehicle.getBrand());
            lists[2].add(vehicle.getModel());
            lists[3].add(vehicle.getExteriorColor());
            lists[4].add(vehicle.getInteriorColor());
        });
    }

    static void assignLabelFields(Map<String, JLabel> mapJLabel,
                                         Font small, Font bold, String [] labels, String [] labelValues) {

        for(int i = 0; i < labels.length; i++) {
            mapJLabel.put(labels[i], new JLabel(labelValues[i]));
        }

        mapJLabel.forEach((key, value) -> {
            if(key.split("_")[0].equals("small")) {
                value.setFont(small);
            } else {
                value.setFont(bold);
            }
        });
    }

    static void assignFieldValues(Map<String, JComboBox<String>> mapJComboBox,
                                   Map<String, JTextField> mapJTextField, Font normal,
                                   String[] comboBoxKey, String[] jTextFieldKeys, Object[] ... objects) {

        for(int i = 0; i < comboBoxKey.length; i++) {
            mapJComboBox.put(comboBoxKey[i], new JComboBox(objects[i]));
        }
        mapJComboBox.forEach((key, value) -> value.setFont(normal));

        for(int i = 0; i < jTextFieldKeys.length; i++) {
            mapJTextField.put(jTextFieldKeys[i], new JTextField());
        }
        mapJTextField.forEach((key, value) -> value.setFont(normal));
    }

    static GroupLayout.SequentialGroup createSequentialGroupOfParallelGroups(GroupLayout layout, JComponent ... components) {
        GroupLayout.SequentialGroup row = layout.createSequentialGroup();
        for(JComponent component : components) {
            GroupLayout.ParallelGroup column =
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(component);
            row.addGroup(column);
        }
        return row;
    }

    static GroupLayout.ParallelGroup createParallelGroupWithComponents(GroupLayout layout, JComponent ... components) {
        GroupLayout.ParallelGroup row = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);

        for(JComponent component : components) {
            row.addComponent(component);
        }
        return row;
    }
}
