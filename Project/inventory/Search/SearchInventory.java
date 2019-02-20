package Project.inventory.Search;

import Project.inventory.interfaces.Vehicle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class SearchInventory extends JFrame {

    private static final Font F_BOLD = new Font("TimesRoman", Font.BOLD, 70);
    private static final Font F_NORMAL = new Font("TimesRoman", Font.PLAIN, 60);
    private static final Font F_SMALL = new Font("TimesRoman", Font.ITALIC, 50);

    private final List<Vehicle> vehicleList;
    private final String dealerID;

    //Internal usage variables
    private List<String> carId;
    private List<String> brand;
    private List<String> model;
    private List<String> exteriorColor;
    private List<String> interiorColor;

    //Fields to display in the page
    //Labels
    Map<String, JLabel> mapJLabel;

    //Drop down lists
    Map<String, JComboBox<String>> mapJComboBox;

    //TextFields
    Map<String, JTextField> mapJTextField;

    //Button group
    ButtonGroup vehicleTypeButtonGroup;
    JRadioButton vehicleTypeUsed;
    JRadioButton vehicleTypeUnUsed;

    // Search Button
    JButton searchButton;

    SearchInventory(final List<Vehicle> vehicleList,
                           final String dealerID) {
        this.vehicleList = vehicleList;
        this.dealerID = dealerID;
        populateInternalFields();
        assignLabelFields();
        assignFieldValues();
        assignButtonGroup();
        createSearchButton();
        createComponents();
        setVisible();
    }

    public void setVisible() {
        this.setVisible(true);
    }

    public void setInVisible() {
        this.setVisible(false);
    }

    private void populateInternalFields() {
        carId = new ArrayList<>();
        brand = new ArrayList<>();
        model = new ArrayList<>();
        exteriorColor = new ArrayList<>();
        interiorColor = new ArrayList<>();
        SearchUtils.populateInternalFields(vehicleList, carId, brand, model, exteriorColor, interiorColor);
    }

    private void assignButtonGroup() {
        vehicleTypeButtonGroup = new ButtonGroup();
        vehicleTypeUsed = new JRadioButton("Used");
        vehicleTypeUnUsed = new JRadioButton("UnUsed");
        vehicleTypeUsed.setFont(F_SMALL);
        vehicleTypeUnUsed.setFont(F_SMALL);
        vehicleTypeButtonGroup.add(vehicleTypeUsed);
        vehicleTypeButtonGroup.add(vehicleTypeUnUsed);
    }

    private void assignLabelFields() {
        mapJLabel = new HashMap<>();
        String [] labels = {"nameLabel","brandLabel","modelLabel","yearLabel","MilesLabel",
                            "priceLabel","vehicleTypeLabel", "colorLabel", "small_yearMinLabel",
                            "small_yearMaxLabel","small_milesMinLabel", "small_milesMaxLabel","small_priceMinLabel",
                            "small_priceMaxLabel","small_colorExteriorLabel","small_colorInteriorLabel"};

        String [] labelValues = {"Car ID:","Car Brand:","Car Model:","Year:","Miles:", "Price:",
                "Vehicle Type:","Color:", "Min", "Max", "Min","Max","Min","Max","Exterior","Interior"};

        SearchUtils.assignLabelFields(mapJLabel, F_SMALL, F_BOLD, labels, labelValues);
    }

    private void assignFieldValues() {
        mapJComboBox = new HashMap<>();
        mapJTextField = new HashMap<>();
        String[] comboBoxKey = {"IdCB","brandCB","modelCB","colorInteriorText","colorExteriorText"};
        Object[][] jComboValues={carId.toArray(), brand.toArray(), model.toArray(),
                interiorColor.toArray(), exteriorColor.toArray()};
        String[] jTextFieldKeys = {"yearMinText",
                "yearMaxText","milesMinText","milesMaxText","priceMinText", "priceMaxText"};
        SearchUtils.assignFieldValues(mapJComboBox, mapJTextField, F_NORMAL, comboBoxKey, jTextFieldKeys, jComboValues);
    }


    private void createSearchButton() {
        searchButton = new JButton("Search");
        searchButton.setFont(F_BOLD);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  InventorySearchParam searchParam = new InventorySearchParam();
                  int idSelectedIndex =  mapJComboBox.get("IdCB").getSelectedIndex();
                  int branchSelectedIndex = mapJComboBox.get("brandCB").getSelectedIndex();
                  int modelSelected = mapJComboBox.get("modelCB").getSelectedIndex();
                  int colorInteriorSelectedIndex = mapJComboBox.get("colorInteriorText").getSelectedIndex();
                  int colorExteriorSelectedIndex = mapJComboBox.get("colorExteriorText").getSelectedIndex();

                  String yearMinText = mapJTextField.get("yearMinText").getText();
                  String yearMaxText = mapJTextField.get("yearMaxText").getText();
                  String milesMinText = mapJTextField.get("milesMinText").getText();
                  String milesMaxText = mapJTextField.get("milesMaxText").getText();
                  String priceMinText = mapJTextField.get("milesMinText").getText();
                  String priceMaxText = mapJTextField.get("milesMaxText").getText();

                  searchParam.setYearMin(yearMinText);
                  searchParam.setYearMax(yearMaxText);
                  searchParam.setMilesMax(milesMinText);
                  searchParam.setMilesMax(milesMaxText);
                  searchParam.setPriceMin(priceMinText);
                  searchParam.setPriceMax(priceMaxText);
                  searchParam.setCarId(idSelectedIndex!=0?carId.get(idSelectedIndex) : null);
                  searchParam.setCarBrand(branchSelectedIndex!=0?brand.get(branchSelectedIndex) : null);
                  searchParam.setCarModel(modelSelected!=0?model.get(modelSelected) : null);
                  searchParam.setExteriorColor(colorExteriorSelectedIndex!=0?exteriorColor.get(colorExteriorSelectedIndex) : null);
                  searchParam.setInteriorColor(colorInteriorSelectedIndex!=0?interiorColor.get(colorInteriorSelectedIndex) : null);
            }
        });
    }

    public void createComponents() {
        Container c = this.getContentPane();
        JPanel panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        GroupLayout.ParallelGroup allRows = layout.createParallelGroup(GroupLayout.Alignment.LEADING);
        allRows.addGap(100, 300, 1000);

        /// Row 1
        GroupLayout.SequentialGroup row1 = SearchUtils.createSequentialGroupOfParallelGroups(layout,
                mapJLabel.get("nameLabel"), mapJComboBox.get("IdCB"), mapJLabel.get("modelLabel"),
                mapJComboBox.get("modelCB"), mapJLabel.get("brandLabel"), mapJComboBox.get("brandCB"));

        //Row 2
        GroupLayout.SequentialGroup row2 = SearchUtils.createSequentialGroupOfParallelGroups(layout,
                mapJLabel.get("yearLabel"), mapJLabel.get("small_yearMinLabel"), mapJTextField.get("yearMinText"),
                mapJLabel.get("small_yearMaxLabel"), mapJTextField.get("yearMaxText"));

        //Row 3
        GroupLayout.SequentialGroup row3 = SearchUtils.createSequentialGroupOfParallelGroups(layout,
                mapJLabel.get("MilesLabel"), mapJLabel.get("small_milesMinLabel"),
                mapJTextField.get("milesMinText"), mapJLabel.get("small_milesMaxLabel"),
                mapJTextField.get("milesMaxText"));

        //Row 4
        GroupLayout.SequentialGroup row4 = SearchUtils.createSequentialGroupOfParallelGroups(layout,
                mapJLabel.get("priceLabel"), mapJLabel.get("small_priceMinLabel"),
                mapJTextField.get("priceMinText"), mapJLabel.get("small_priceMaxLabel"),
                mapJTextField.get("priceMaxText"));

        //Row 5
        GroupLayout.ParallelGroup row5_1_1 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(vehicleTypeUsed);
        GroupLayout.ParallelGroup row5_1_2 = layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(vehicleTypeUnUsed);
        GroupLayout.SequentialGroup row5_1 = layout.createSequentialGroup()
                .addComponent(mapJLabel.get("vehicleTypeLabel"))
                .addGroup(row5_1_1)
                .addGroup(row5_1_2);
        GroupLayout.SequentialGroup row5 = layout.createSequentialGroup().addGroup(row5_1);

        //Row 6
        GroupLayout.SequentialGroup row6 = SearchUtils.createSequentialGroupOfParallelGroups(layout,
                mapJLabel.get("colorLabel"), mapJLabel.get("small_colorExteriorLabel"),
                mapJComboBox.get("colorExteriorText"), mapJLabel.get("small_colorInteriorLabel"),
                mapJComboBox.get("colorInteriorText"));

        //Row 7
        GroupLayout.SequentialGroup row7_1 = layout.createSequentialGroup()
                .addComponent(searchButton);
        row7_1.addContainerGap(400, 900);
        row7_1.addGap(60);
        GroupLayout.SequentialGroup row7 = layout.createSequentialGroup().addGroup(row7_1);

        //Main
        layout.setHorizontalGroup(allRows
                .addGroup(row1)
                .addGroup(row2)
                .addGroup(row3)
                .addGroup(row4)
                .addGroup(row5)
                .addGroup(row6)
                .addGroup(row7));

        GroupLayout.ParallelGroup v_1 = SearchUtils.createParallelGroupWithComponents(layout,
                mapJLabel.get("nameLabel"), mapJComboBox.get("IdCB"),
                mapJLabel.get("brandLabel"), mapJComboBox.get("brandCB"),
                mapJLabel.get("modelLabel"), mapJComboBox.get("modelCB"));

        GroupLayout.ParallelGroup v_2 = SearchUtils.createParallelGroupWithComponents(layout,
                mapJLabel.get("yearLabel"), mapJLabel.get("small_yearMinLabel"),
                mapJTextField.get("yearMinText"), mapJLabel.get("small_yearMaxLabel"),
                mapJTextField.get("yearMaxText"));

        GroupLayout.ParallelGroup v_3 = SearchUtils.createParallelGroupWithComponents(layout,
                mapJLabel.get("MilesLabel"), mapJLabel.get("small_milesMinLabel"),
                mapJTextField.get("milesMinText"), mapJLabel.get("small_milesMaxLabel"),
                mapJTextField.get("milesMaxText"));


        GroupLayout.ParallelGroup v_4 = SearchUtils.createParallelGroupWithComponents(layout,
                mapJLabel.get("priceLabel"), mapJLabel.get("small_priceMinLabel"),
                mapJTextField.get("priceMinText"), mapJLabel.get("small_priceMaxLabel"),
                mapJTextField.get("priceMaxText"));

        GroupLayout.ParallelGroup v_5 = SearchUtils.createParallelGroupWithComponents(layout,
                mapJLabel.get("vehicleTypeLabel"), vehicleTypeUsed, vehicleTypeUnUsed);

        GroupLayout.ParallelGroup v_6 = SearchUtils.createParallelGroupWithComponents(layout,
                mapJLabel.get("colorLabel"), mapJLabel.get("small_colorExteriorLabel"),
                mapJComboBox.get("colorExteriorText"), mapJLabel.get("small_colorInteriorLabel"),
                mapJComboBox.get("colorInteriorText"));

        GroupLayout.ParallelGroup v_7 = layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(searchButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(v_1)
                .addGroup(v_2)
                .addGroup(v_3)
                .addGroup(v_4)
                .addGroup(v_5)
                .addGroup(v_6)
                .addGroup(v_7));

        panel.setLayout(layout);
       // setSize(1600, 1600);
        c.add(panel);
        pack();
    }

    public static void main(String[] args) {
        SearchInventory search = new SearchInventory(new ArrayList<>(), "Dealer");
    }


}
