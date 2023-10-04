package com.appslab.imagedownloaderusinggithub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import android.content.Intent;
import android.net.Uri;

public class PdfViewerActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_viewer_activity);

        pdfView = findViewById(R.id.pdfView);

        // Get the PDF URL from the intent
        String pdfUrl = getIntent().getStringExtra("pdf_url");

        // Load and display the PDF
        loadAndDisplayPdf(pdfUrl);
    }

    private void loadAndDisplayPdf(String pdfUrl) {
        Uri uri = Uri.parse(pdfUrl);
        pdfView.fromUri(uri)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .enableAntialiasing(true)
                .load();
    }
}
