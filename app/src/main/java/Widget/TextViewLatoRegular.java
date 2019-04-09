package Widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewLatoRegular extends AppCompatTextView {

    public TextViewLatoRegular(Context context) {
        super(context);

        init();
    }

    public TextViewLatoRegular(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public TextViewLatoRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"Lato-Regular.ttf");
    }
}
