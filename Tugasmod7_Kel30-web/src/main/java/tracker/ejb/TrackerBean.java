package tracker.ejb;
import jakarta.ejb.Stateful;

@Stateful
public class TrackerBean implements TrackerBeanLocal {
    private double total = 0;
    private int count = 0;
    
    @Override
    public double add(double value) {
        total += value;
        count += 1;
        return total;
    }
    @Override
    public double average() {
        return total / count;
    }
    @Override
    public int getCount() {
        return count;
    }
    @Override
    public double getTotal() {
        return total;
    } 
    public double[] getValues(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
