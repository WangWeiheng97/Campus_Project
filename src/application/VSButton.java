package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class VSButton {
    
    public Button vsButton;
    public HBox buttonBox;

    public VSButton(Team[][] teams, int seriesNumber, int teamNum) {
        vsButton = new Button("VS");
        buttonBox = new HBox();
        // set action
        vsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String name1 = teams[seriesNumber-1][teamNum*2-1].name.getText();
                String name2 = teams[seriesNumber-1][teamNum*2].name.getText();
                String score1 = teams[seriesNumber-1][teamNum*2-1].score.getText();
                String score2 = teams[seriesNumber-1][teamNum*2].score.getText();
                Integer scoreNum1 = Integer.valueOf(score1);
                Integer scoreNum2 = Integer.valueOf(score2);
                if(scoreNum1>scoreNum2) {
                    teams[seriesNumber][teamNum].name.setText(name1);
                    teams[seriesNumber][teamNum].score.setVisible(true);
                }else {
                    teams[seriesNumber][teamNum].name.setText(name2);
                    teams[seriesNumber][teamNum].score.setVisible(true);
                }
            }
        });
        buttonBox.getChildren().add(vsButton);
        buttonBox.setAlignment(Pos.CENTER);

    }
    
    

}
