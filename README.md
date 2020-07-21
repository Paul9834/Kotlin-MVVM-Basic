# Learn-Kotlin

**Uso de (v?)**

Evita los NullPointerException en las variables

**Declarando Variables**

    val button: Button? = null

**Implementando Interfaces**

    class MainActivity : AppCompatActivity(), Runnable, View.OnClickListener  {
    
**Interfaces implementadas:**

    override fun run() {
    
        }
        
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bottom -> {
            onDestroy()
            }
            R.id.gone -> {
             onPause()
            }
        }
    }
    
