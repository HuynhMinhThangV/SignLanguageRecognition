package org.signlanguage;

import nu.pattern.OpenCV;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.HOGDescriptor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class SignLanguageRecognition {
    static {
        OpenCV.loadLocally();

    }

    //Tạo features list và labels list để load data từ dataset vừa tạo được
    private List<double[]> features = new ArrayList<>();
    private List<String> labels = new ArrayList<>();
    private int k = 3; // Số lượng láng giềng trong KNN

    public SignLanguageRecognition(String csvFilePath) throws IOException {
        loadCSVData(csvFilePath);
    }

    // Hàm đọc CSV và lưu trữ dữ liệu vào mảng
    private void loadCSVData(String csvFilePath) throws IOException {

    }


    // Trích xuất đặc trưng HOG từ ảnh đầu vào để dự đoán
    public double[] extractHOGFeatures(Mat image) {
        return null;
    }


    // Hàm tính khoảng cách Euclidean giữa hai vector để so sánh độ gần gũi giữa các điểm dữ liệu
    private double euclideanDistance(double[] vec1, double[] vec2) {
        return 0;
    }

    // Hàm dự đoán label của ảnh đầu vào
    public String predict(Mat inputImage) {
        return null;
    }

    // Tìm k nhãn gần nhất
    private List<String> findKNearestLabels(List<Double> distances, int k) {
        return null;
    }

    // Tìm nhãn xuất hiện nhiều nhất
    private String majorityLabel(List<String> nearestLabels) {
      return null;
    }

    public static void main(String[] args) {
        try {
            SignLanguageRecognition recognizer = new SignLanguageRecognition("dataset.csv");
            Mat testImage = Imgcodecs.imread("C:\\Users\\huynh\\Downloads\\Compressed\\asl_dataset\\0\\hand2_0_dif_seg_1_cropped.jpeg", Imgcodecs.IMREAD_GRAYSCALE);
            String predictedLabel = recognizer.predict(testImage);
            System.out.println("Label dự đoán cho ảnh: " + predictedLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}