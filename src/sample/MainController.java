package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private ToggleButton bk;

    @FXML
    private ToggleButton filtr;

    @FXML
    private ToggleButton pervod;

    @FXML
    private ToggleButton what;

    @FXML
    private ToggleButton setting;

    @FXML
    private ToggleButton account;

    @FXML
    private VBox openbk;

    @FXML
    private VBox openfiltr;

    @FXML
    private VBox openpervod;

    @FXML
    private VBox openwhat;

    @FXML
    private VBox opensetting;

    @FXML
    private VBox openaccount;


    @FXML
    void initialize(){
        final int[] i = {0};
        final int[] j = {0};
        final int[] k = {0};
        final int[] m = {0};
        final int[] n = {0};
        final int[] u = {0};

        bk.setOnAction(event -> {
            if(i[0] ==0) {
                openbk.setVisible(true);
                System.out.println("open");
                i[0]++;
                j[0]=0;
                k[0]=0;
                u[0]=0;
                n[0]=0;
                m[0]=0;
            }

            else{
                openbk.setVisible(false);
                System.out.println("anopen");
                i[0]--;
            }
        });


        filtr.setOnAction(event -> {
            if(j[0] ==0) {
                openfiltr.setVisible(true);
                System.out.println("open");
                j[0]++;
                i[0]=0;
                k[0]=0;
                m[0]=0;
                n[0]=0;
                u[0]=0;
            }

            else{
                openfiltr.setVisible(false);
                System.out.println("anopen");
                j[0]--;
            }
        });

        pervod.setOnAction(event -> {
            if(k[0] ==0) {
                openpervod.setVisible(true);
                System.out.println("open");
                k[0]++;
                j[0]=0;
                i[0]=0;
                m[0]=0;
                n[0]=0;
                u[0]=0;
            }

            else{
                openpervod.setVisible(false);
                System.out.println("anopen");
                k[0]--;
            }
        });

        what.setOnAction(event -> {
            if(m[0] ==0) {
                openwhat.setVisible(true);
                System.out.println("open");
                m[0]++;
                j[0]=0;
                i[0]=0;
                n[0]=0;
                k[0]=0;
                u[0]=0;
            }

            else{
                openwhat.setVisible(false);
                System.out.println("anopen");
                m[0]--;
            }
        });

        setting.setOnAction(event -> {
            if(n[0] ==0) {
                opensetting.setVisible(true);
                System.out.println("open");
                n[0]++;
                m[0]=0;
                j[0]=0;
                i[0]=0;
                k[0]=0;
                u[0]=0;
            }

            else{
                opensetting.setVisible(false);
                System.out.println("anopen");
                n[0]--;
            }
        });

        account.setOnAction(event -> {
            if(u[0] ==0) {
                openaccount.setVisible(true);
                System.out.println("open");
                u[0]++;
                m[0]=0;
                j[0]=0;
                i[0]=0;
                k[0]=0;
                n[0]=0;
            }

            else{
                openaccount.setVisible(false);
                System.out.println("anopen");
                u[0]--;
            }
        });


    }

}
