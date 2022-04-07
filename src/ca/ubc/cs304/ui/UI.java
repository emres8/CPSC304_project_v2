package ca.ubc.cs304.ui;

import ca.ubc.cs304.delegates.ReservationDelegate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI extends JFrame implements ActionListener{
    private JButton divisionButton;
    private JButton joinButton;
    private JButton aggregateButton;
    private JButton jointAggregateButton;
    private JButton selectionButton;
    private JButton projectionButton;
    private JButton deleteButton;
    private JButton insertButton;
    private JButton updateHotelButton;
    private JButton restartButton;

    private JComboBox projectionComboBox;

    private JPanel panel1;
    private JTabbedPane tabbedPane;
    private JPanel queryPanel;
    private JPanel reservationPanel;
    private JPanel invoicePanel;
    private JPanel eventPanel;
    private JPanel paymentPanel;
    private JPanel hotelPanel;
    private JPanel hotelServicePanel;
    private JPanel facilityPanel;
    private JPanel roomPanel;
    private JPanel customerPanel;
    private JTable customerTable;
    private JTable facilityTable;
    private JTable hotelServiceTable;
    private JTable hotelTable;
    private JTable invoiceTable;
    private JTable paymentTable;
    private JTable eventTable;
    private JTable reservationTable;
    private JTable roomTable;
    private JComboBox deleteComboBox;
    private JTabbedPane tabbedPaneQuery;
    private JPanel selectionPane;
    private JPanel projectionPane;
    private JPanel updatePane;
    private JPanel insertPane;
    private JPanel deletePane;
    private JPanel joinPane;
    private JPanel aggregatePane;
    private JPanel nestedAggregatePane;
    private JPanel divisionPane;
    private JPanel restartPanel;
    private JTable divisionTable;
    private JTable joinTable;
    private JTable projectionTable;
    private JTable aggregateTable;
    private JTable jointAggregateTable;
    private JComboBox selectionColumnNameComboBox;
    private JComboBox selectionOperatorComboBox;
    private JTextField selectionValueTextField;
    private JTable selectionTable;
    private JTable deleteReservationTable;
    private JTextField reservationID;
    private JTextField roomNo;
    private JComboBox customerID;
    private JComboBox hotelID;
    private JComboBox invoiceNo;
    private JComboBox eventID;
    private JComboBox facilityID;
    private JTable insertReservationTable;
    private JTable updateHotelTable;


    private ReservationDelegate delegate = null;



    private JTextField checkOutDate;
    private JTextField checkInDate;
    private JTextField reservationDate;
    private JTextField hotelid;
    private JTextField hotelName;
    private JTextField newHotelName;


    public UI(ReservationDelegate delegate){
        this.delegate = delegate;
        setContentPane(panel1);
        setTitle("Hotel Management Database");
        setSize(1000,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        delegate.databaseSetup();


        deleteButton.addActionListener(this);
        joinButton.addActionListener(this);
        aggregateButton.addActionListener(this);
        jointAggregateButton.addActionListener(this);
        selectionButton.addActionListener(this);
        projectionButton.addActionListener(this);
        insertButton.addActionListener(this);
        divisionButton.addActionListener(this);
        restartButton.addActionListener(this);


      //  customerTable = new JTable(delegate.getDefaultTable("CUSTOMER"));
        customerTable.setGridColor(Color.BLACK);
        customerPanel.setLayout(new BoxLayout(customerPanel, BoxLayout.PAGE_AXIS));
        customerPanel.add(new JScrollPane(customerTable));

      //  reservationTable = new JTable(delegate.getDefaultTable("RESERVATION"));
        reservationTable.setGridColor(Color.BLACK);
        reservationPanel.setLayout(new BoxLayout(reservationPanel, BoxLayout.PAGE_AXIS));
        reservationPanel.add(new JScrollPane(reservationTable));

     //   invoiceTable = new JTable(delegate.getDefaultTable("INVOICE"));
        invoiceTable.setGridColor(Color.BLACK);
        invoicePanel.setLayout(new BoxLayout(invoicePanel, BoxLayout.PAGE_AXIS));
        invoicePanel.add(new JScrollPane(invoiceTable));

      //  eventTable = new JTable(delegate.getDefaultTable("EVENTS"));
        eventTable.setGridColor(Color.BLACK);
        eventPanel.setLayout(new BoxLayout(eventPanel, BoxLayout.PAGE_AXIS));
        eventPanel.add(new JScrollPane(eventTable));

      //  facilityTable = new JTable(delegate.getDefaultTable("FACILITY"));
        facilityTable.setGridColor(Color.BLACK);
        facilityPanel.setLayout(new BoxLayout(facilityPanel, BoxLayout.PAGE_AXIS));
        facilityPanel.add(new JScrollPane(facilityTable));

      //  hotelTable = new JTable(delegate.getDefaultTable("HOTEL"));
        hotelTable.setGridColor(Color.BLACK);
        hotelPanel.setLayout(new BoxLayout(hotelPanel, BoxLayout.PAGE_AXIS));
        hotelPanel.add(new JScrollPane(hotelTable));

      //  paymentTable = new JTable(delegate.getDefaultTable("PAYMENT"));
        paymentTable.setGridColor(Color.BLACK);
        paymentPanel.setLayout(new BoxLayout(paymentPanel, BoxLayout.PAGE_AXIS));
        paymentPanel.add(new JScrollPane(paymentTable));

        //roomTable = new JTable(delegate.getDefaultTable("ROOMS"));
        roomTable.setGridColor(Color.BLACK);
        roomPanel.setLayout(new BoxLayout(roomPanel, BoxLayout.PAGE_AXIS));
        roomPanel.add(new JScrollPane(roomTable));

      //  hotelServiceTable = new JTable(delegate.getDefaultTable("HOTELSERVICES"));
        hotelServiceTable.setGridColor(Color.BLACK);
        hotelServicePanel.setLayout(new BoxLayout(hotelServicePanel, BoxLayout.PAGE_AXIS));
        hotelServicePanel.add(new JScrollPane(hotelServiceTable));

        divisionTable.setGridColor(Color.BLACK);
        divisionPane.setLayout(new BoxLayout(divisionPane, BoxLayout.PAGE_AXIS));
        divisionPane.add(new JScrollPane(divisionTable));

        joinTable.setGridColor(Color.BLACK);
        joinPane.setLayout(new BoxLayout(joinPane, BoxLayout.PAGE_AXIS));
        joinPane.add(new JScrollPane(joinTable));


        projectionTable.setGridColor(Color.BLACK);
        projectionPane.setLayout(new BoxLayout(projectionPane, BoxLayout.PAGE_AXIS));
        projectionPane.add(new JScrollPane(projectionTable));

        aggregateTable.setGridColor(Color.BLACK);
        aggregatePane.setLayout(new BoxLayout(aggregatePane, BoxLayout.PAGE_AXIS));
        aggregatePane.add(new JScrollPane(aggregateTable));

        jointAggregateTable.setGridColor(Color.BLACK);
        nestedAggregatePane.setLayout(new BoxLayout(nestedAggregatePane, BoxLayout.PAGE_AXIS));
        nestedAggregatePane.add(new JScrollPane(jointAggregateTable));

        selectionTable.setGridColor(Color.BLACK);
        selectionPane.setLayout(new BoxLayout(selectionPane, BoxLayout.PAGE_AXIS));
        selectionPane.add(new JScrollPane(selectionTable));

        deleteReservationTable.setGridColor(Color.BLACK);
        //deletePane.setLayout(new BoxLayout(deletePane,BoxLayout.PAGE_AXIS));
        //deletePane.add(new JScrollPane(deleteReservationTable));

        insertReservationTable.setGridColor(Color.BLACK);





        ArrayList<String> idList = delegate.getReservationIdList();
        idList.forEach((n) -> deleteComboBox.addItem(n));



        ArrayList<String> columnList = delegate.getColumnList("RESERVATION");
        columnList.forEach((n) -> projectionComboBox.addItem(n));

        ArrayList<String> invoiceColumnList = delegate.getColumnList("INVOICE");
        invoiceColumnList.forEach((n) -> selectionColumnNameComboBox.addItem(n));

        ArrayList<String> operatorList = new ArrayList<String>();
        operatorList.add("less");
        operatorList.add("equal");
        operatorList.add("bigger");
        operatorList.forEach((n) -> selectionOperatorComboBox.addItem(n));



    }

    private void updateTables(){
        reservationTable.setModel(delegate.getDefaultTable( "SELECT * FROM", "RESERVATION"));
        eventTable.setModel(delegate.getDefaultTable("SELECT * FROM","EVENTS"));
        customerTable.setModel(delegate.getDefaultTable("SELECT * FROM","CUSTOMER"));
        invoiceTable.setModel(delegate.getDefaultTable("SELECT * FROM","INVOICE"));
        hotelTable.setModel(delegate.getDefaultTable("SELECT * FROM","HOTEL"));
        facilityTable.setModel(delegate.getDefaultTable("SELECT * FROM","FACILITY"));
        hotelServiceTable.setModel(delegate.getDefaultTable("SELECT * FROM","HOTELSERVICES"));
        roomTable.setModel(delegate.getDefaultTable("SELECT * FROM","ROOMS"));
        paymentTable.setModel(delegate.getDefaultTable("SELECT * FROM","PAYMENT"));
        deleteReservationTable.setModel(delegate.getDefaultTable("SELECT * FROM","RESERVATION"));
        insertReservationTable.setModel(delegate.getDefaultTable("SELECT * FROM","RESERVATION"));
        updateHotelTable.setModel(delegate.getDefaultTable("SELECT * FROM","Hotel"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteButton){
            String resID = String.valueOf(deleteComboBox.getSelectedItem());
            int index = deleteComboBox.getSelectedIndex();
            delegate.deleteReservation(Integer.parseInt(resID));
            reservationTable.setModel(delegate.getDefaultTable("SELECT * FROM","RESERVATION"));
            deleteReservationTable.setModel(delegate.getDefaultTable("SELECT * FROM","RESERVATION"));
            deleteComboBox.removeItemAt(index);
        }
        if (e.getSource() == insertButton){
            int reservationsID = Integer.parseInt(reservationID.getText());

            String reservationsDate = String.valueOf(reservationDate.getText());

            String checkInsDate = String.valueOf(checkInDate.getText());

            String checkOutsDate = String.valueOf(checkOutDate.getText());
            int roomsNo = Integer.parseInt(roomNo.getText());
            //int hotelsID = Integer.parseInt(hotelID.getText());
            //int customersID = Integer.parseInt(customerID.getText());
            //int invoicesNo = Integer.parseInt(invoiceNo.getText());
            //int eventsID = Integer.parseInt(eventID.getText());
            //int facilitiesID = Integer.parseInt(facilityID.getText());
            //ReservationModel model = new ReservationModel(reservationsID,reservationsDate,checkInsDate,checkOutsDate,roomsNo,customersID,hotelsID,invoicesNo,eventsID,facilitiesID);
           // delegate.insertReservation(model);
            insertReservationTable.setModel(delegate.getDefaultTable("SELECT * FROM","RESERVATION"));
        }
        if(e.getSource() == updateHotelButton){
            int ID = Integer.valueOf(hotelid.getText());
            String name = String.valueOf(hotelName.getText());
            String newName = String.valueOf(newHotelName.getText());
            delegate.updateHotel(ID,name,newName);
            updateHotelTable.setModel(delegate.getDefaultTable("SELECT * FROM", "HOTEL"));
            hotelTable.setModel(delegate.getDefaultTable("SELECT * FROM", "HOTEL"));
        }
        if(e.getSource() == joinButton){
            joinTable.setModel(delegate.joinMailsofCustomersMoreThanOneWeek());
        }
        if(e.getSource() == aggregateButton){
            aggregateTable.setModel(delegate.aggregateMostExpensiveInvoice());
        }
        if(e.getSource() == divisionButton){
            divisionTable.setModel(delegate.divisionCustomersUsingAllServices());
        }
        if(e.getSource() == jointAggregateButton){
            jointAggregateTable.setModel(delegate.nestedAggregationInvoice());
        }
        if(e.getSource() == selectionButton){
            int value = Integer.valueOf(selectionValueTextField.getText());
            String operator = String.valueOf(selectionOperatorComboBox.getSelectedItem());
            String invoiceColumnName = String.valueOf(selectionColumnNameComboBox.getSelectedItem());
            selectionTable.setModel(delegate.selectionInvoice(value,operator,invoiceColumnName));
        }
        if(e.getSource() == projectionButton){
            String columnName = String.valueOf(projectionComboBox.getSelectedItem());
            projectionTable.setModel(delegate.projectionReservation(columnName));

        }
        if(e.getSource() == restartButton){
            delegate.databaseSetup();
            this.updateTables();

        }


    }


}
