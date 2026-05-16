import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    private lateinit var adView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init AdMob (do this once, early)
        MobileAds.initialize(this)

        // Load banner
        adView = findViewById(R.id.adView)
        adView.loadAd(AdRequest.Builder().build())

        // Your existing WebView setup below...
        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true      // needed for localStorage
        webView.settings.allowFileAccessFromFileURLs = true
        webView.settings.databaseEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("file:///android_asset/index.html")
    }

    // Lifecycle forwarding — required by AdMob
    override fun onResume()  { super.onResume();  adView.resume() }
    override fun onPause()   { super.onPause();   adView.pause() }
    override fun onDestroy() { super.onDestroy(); adView.destroy() }
}
