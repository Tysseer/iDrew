import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class DrawingView extends View {

    public DrawingView(Context context) {
        super(context);
        setupDrawing();

    }

    public DrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupDrawing();

    }

    public DrawingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setupDrawing();
    }


    private void setupDrawing(){
//get drawing area setup for interaction
    }
}
