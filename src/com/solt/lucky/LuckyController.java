package com.solt.lucky;

import java.time.LocalDate;
import java.util.Calendar;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;

public class LuckyController {

    @FXML
    private DatePicker bdate;

    @FXML
    private Label lblage;

    @FXML
    private Label lbllckno;
    
    @FXML
    private DialogPane dialog;
    
    public int by=0,bm=0,bd=0,sum1=0,sum2=0,sum3=0,sum=0;
    public void Lucky() {
    	
    	
    	try {
    			LocalDate bdaydate =  bdate.getValue();
    			Calendar year = Calendar.getInstance();
    			long age = year.getWeekYear() - bdaydate.getYear();
    			long y = bdaydate.getYear();
    			long m = bdaydate.getMonthValue();
    			long d = bdaydate.getDayOfMonth();
    			while (y>0) {
    				by += (int) y%10;
    				y = (int) y/10;
    			}
    			while (by>0) {
    				sum1 += by%10;
    				by =by/10;
    			}
    			while (m>0) {
    				bm += (int) m%10;
    				m = (int) m/10;
    			}
    			while (bm>0) {
    				sum2 += bm%10;
    				bm =bm/10;
    			}
    			while (d>0) {
    				bd += (int) d%10;
    				d = (int) d/10;
    			}
    			while (bd>0) {
    				sum3 += bd%10;
    				bd =bd/10;
    			}
    			sum = sum1+sum2+sum3;
    			int luckyno=0,lckno=0;
    			while (sum>0) {
    				luckyno += sum%10;
    				sum = sum/10;
    			}
    			while(luckyno>0) {
    				lckno += luckyno%10;
    				luckyno = luckyno/10;
    			}
    			lblage.setText(String.valueOf(age));
    			lbllckno.setText(String.valueOf(lckno));
    			by=0;bm=0;bd=0;sum1=0;sum2=0;sum3=0;sum=0;
    			luckyno=0;lckno=0;
			} catch (Exception e) {
				Alert alert = new Alert(Alert.AlertType.WARNING);
				alert.setTitle("Luck Me");
				alert.setContentText("Please, select your birthday!");
				alert.show();
		}
    	
    	}	
}
