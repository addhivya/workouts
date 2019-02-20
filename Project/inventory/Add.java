import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * Created by LynnTeng on 2018/11/25.
 */
public class Add extends JFrame {

    public JTable vehicleTable;
    public Vehicles vehicles;
    public VehiclesTableModel model;

    public AddVehicleInfo addVehicleInfo;

    public Add(Vehicles vehicles) {
        this.vehicles = vehicles;
        model = new VehiclesTableModel(this.vehicles);
        JTable vehiclesTable = new JTable(model);
        JScrollPane jScrollPane = new JScrollPane(vehiclesTable);
        jScrollPane.setSize(500, 400);

        Container container = getContentPane();
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addButton = new JButton("Add New Vehicle - Click Here!");
        addButton.addActionListener(e -> addVehicleInfo = new AddVehicleInfo());

        panel.add(addButton);
        panel.add(jScrollPane);

        container.add(panel);
        setSize(600, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        Vehicles s = new Vehicles();
        new Add(s);
    }

    class AddVehicleInfo extends JFrame {
        String[] vehicleList = new String[]{"---Select Vehicle Type---", "NEW", "USED"};
        String[] bodyList = new String[]{"---Select Body Type---", "VAN", "SUV", "JEEP"};
        JLabel vehicleId = new JLabel("Vehicle ID:");
        JLabel year = new JLabel("Year:");
        JLabel make = new JLabel("Make:");
        JLabel model = new JLabel("Model:");
        JLabel price = new JLabel("Price:");
        JLabel exteriorColor = new JLabel("Exterior Color:");
        JLabel interiorColor = new JLabel("Interior Color:");
        JLabel miles = new JLabel("Miles:");
        JLabel vehicleType = new JLabel("Vehicle Type:");
        JLabel bodyType = new JLabel("Body Type:");
        JTextField vehicleIdText = new JTextField(20);
        JTextField yearText = new JTextField(20);
        JTextField makeText = new JTextField(20);
        JTextField modelText = new JTextField(20);
        JTextField priceText = new JTextField(20);
        JTextField exteriorColorText = new JTextField(20);
        JTextField interiorColorText = new JTextField(20);
        JTextField milesText = new JTextField(20);
        JComboBox<String> vehicleTypeBox = new JComboBox(vehicleList);
        JComboBox<String> bodyTypeBox = new JComboBox(bodyList);


        public AddVehicleInfo() {

            super("Adding Vehicle Information...");
            setLocation(100, 50);
            setSize(1600, 900);
            setVisible(true);

            Container container = getContentPane();
            container.setLayout(new GridLayout(4, 2));
            Font font = new Font("TimesRoman", Font.PLAIN, 20);

            //VehicleId
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            vehicleId.setFont(font);
            vehicleIdText.setFont(font);
            panel.add(vehicleId);
            panel.add(vehicleIdText);
            container.add(panel);

            //Year
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            year.setFont(font);
            yearText.setFont(font);
            panel.add(year);
            panel.add(yearText);
            container.add(panel);

            //Make
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            make.setFont(font);
            makeText.setFont(font);
            panel.add(make);
            panel.add(makeText);
            container.add(panel);

            //Model
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            model.setFont(font);
            modelText.setFont(font);
            panel.add(model);
            panel.add(modelText);
            container.add(panel);

            //Price
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            price.setFont(font);
            priceText.setFont(font);
            panel.add(price);
            panel.add(priceText);
            container.add(panel);

            //ExteriorColor
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            exteriorColor.setFont(font);
            exteriorColorText.setFont(font);
            panel.add(exteriorColor);
            panel.add(exteriorColorText);
            container.add(panel);

            //InteriorColor
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            interiorColor.setFont(font);
            interiorColorText.setFont(font);
            panel.add(interiorColor);
            panel.add(interiorColorText);
            container.add(panel);

            //Miles
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            miles.setFont(font);
            milesText.setFont(font);
            panel.add(miles);
            panel.add(milesText);
            container.add(panel);

            //VehicleType
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            vehicleType.setFont(font);
            panel.add(vehicleType);
            panel.add(vehicleTypeBox);
            container.add(panel);

            //BodyType
            panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            bodyType.setFont(font);
            panel.add(bodyType);
            panel.add(bodyTypeBox);
            container.add(panel);

            //Add
            panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JButton add = new JButton("Add to Database - Click Here");
            add.addActionListener(e -> {
                Add.this.vehicles.addVehicle(
                        new Vehicle(
                                Integer.parseInt(AddVehicleInfo.this.yearText.getText()),
                                Integer.parseInt(AddVehicleInfo.this.priceText.getText()),
                                Integer.parseInt(AddVehicleInfo.this.milesText.getText()),
                                AddVehicleInfo.this.vehicleIdText.getText(),
                                AddVehicleInfo.this.makeText.getText(),
                                AddVehicleInfo.this.modelText.getText(),
                                AddVehicleInfo.this.exteriorColorText.getText(),
                                AddVehicleInfo.this.interiorColorText.getText(),
                                AddVehicleInfo.this.vehicleTypeBox.getSelectedItem().toString().equals("NEW"),
                                AddVehicleInfo.this.bodyTypeBox.getSelectedItem().toString().equals("VAN")
                        ));
                Add.this.vehicleTable.updateUI();
                dispose();
            });
            add.setFont(font);
            panel.add(add);
            container.add(panel);
        }
    }
}

class Vehicles {
    private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Collection<Vehicle> getVehicles() {
        return vehicles;

    }

    public void addVehicle(Vehicle s) {
        vehicles.add(s);
    }

    public int getNumberOfVehicles() {
        return getVehicles().size();
    }

}

class Vehicle {
    int year;
    int price;
    int miles;
    String id;
    String make;
    String model;
    String excolor;
    String incolor;
    boolean type = false;
    boolean bodyType = false;



    public Vehicle(int year, int price, int miles, String id, String make, String model, String excolor, String incolor, boolean type, boolean bodyType) {
        this.year = year;
        this.price = price;
        this.miles = miles;
        this.id = id;
        this.make = make;
        this.model = model;
        this.excolor = excolor;
        this.incolor = incolor;
        this.type = type;
        this.bodyType = bodyType;
    }
}

class VehiclesTableModel implements TableModel {

    private Vehicles vehicles;

    public VehiclesTableModel(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public int getRowCount() {
        return vehicles.getNumberOfVehicles();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0)
            return "VehicleId";
        if (columnIndex == 1)
            return "Year";
        if (columnIndex == 2)
            return "Model";
        if (columnIndex == 3)
            return "Price";
        if (columnIndex == 4)
            return "ExteriorColor";
        if (columnIndex == 5)
            return "InteriorColor";
        if (columnIndex == 6)
            return "Miles";
        if (columnIndex == 7)
            return "VehicleType";
        if (columnIndex == 8)
            return "BodyType";
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Collection<Vehicle> s = vehicles.getVehicles();
        int row = -1;
        for (Vehicle vehicle : s) {
            row++;
            if (row == rowIndex) {
                if (columnIndex == 0) {
                    return vehicle.id + "";
                }
                if (columnIndex == 1) {
                    return vehicle.year;
                }
                if (columnIndex == 2) {
                    return vehicle.model;
                }
                if (columnIndex == 3) {
                    return vehicle.price;
                }
                if (columnIndex == 4) {
                    return vehicle.excolor;
                }
                if (columnIndex == 5) {
                    return vehicle.incolor;
                }
                if (columnIndex == 6) {
                    return vehicle.miles;
                }
                if (columnIndex == 7) {
                    return vehicle.type? "NEW": "USED";
                }
                if (columnIndex == 3) {
                    return vehicle.bodyType? "VAN": "SUV";
                }
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
    }

}

