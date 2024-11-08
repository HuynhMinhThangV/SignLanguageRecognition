package org.signlanguage;

import nu.pattern.OpenCV;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.HOGDescriptor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HOGFeatureExtractor {
    static {
        //load thư viện opencv
        OpenCV.loadLocally();

    }
    public static void main(String[] args) throws IOException {

    }

    static List<Float> extractHOGFeatures(Mat img) {
        return null;
    }
}
