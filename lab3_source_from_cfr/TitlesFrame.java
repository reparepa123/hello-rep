/*
 * Decompiled with CFR 0_114.
 */
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame
extends JFrame {
	
	/**
	 * <p>Публичное представление основного метода вывода окна</p>
	 */ 
    public TitlesFrame() {
        this.initUI();
    }

	/**
	 * <p>Определяет размер, заголовок и координаты окна приложения.
	 * Здесь выбираются геометрическая форма фигуры и её оформление.</p>
   	 */
    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(14));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }

}
