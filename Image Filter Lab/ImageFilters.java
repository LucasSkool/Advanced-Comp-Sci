import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class ImageFilters {
    public static void main(String[] args) {
        try {
            // Load an image file
            BufferedImage image = loadFile("images/landscape.jpg");

            // apply a filter
            valencia2(image);

            // Save the edited file to desired location
            saveFile("images/LandscapeValencia2.jpg", image);
            
            // to-do: create 9 more filters using the invertColors as a starting point
            // note you might need to run the filters separately to avoid altering the image multiple times

            // to-do: save all changes as individual files using saveFile()


        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    // helper methods
    // This method searches the folder path to the target image and returns a BufferedImage object
    // using the data from the file
    public static BufferedImage loadFile(String pathToImage) throws IOException {
        // Load an image file
        File inputFile = new File(pathToImage);
        BufferedImage image = ImageIO.read(inputFile);
        return image;

    }

    // This method creates a new JPG file at the target save location, and copies the data from the
    // BufferedImage object to the file.
    public static void saveFile(String saveLocation, BufferedImage image) throws IOException {
        // Save the edited image
        File outputFile = new File(saveLocation);
        outputFile.createNewFile();
        ImageIO.write(image, "jpg", outputFile);
        System.out.println("Image color changed and saved successfully!");
    }

    // filter methods

    // invert colors
    public static void invertColors(BufferedImage image) {
        // grab the dimensions
        int width = image.getWidth();
        int height = image.getHeight();

        // loop across the height and width of the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point 
                Color color = new Color(pixel, true);

                // modify the RGB values of the color 
                // the code below inverts colors 
                color = new Color(255 - color.getRed(), 255 - color.getGreen(),
                        255 - color.getBlue());

                // update the pixel's color to the new color 
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }

    }

    public static void monochrome(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point 
                Color color = new Color(pixel, true);

                // modify the RGB values of the color 
                // the code below inverts colors 
                int averageColor = (color.getRed() + color.getBlue() + color.getGreen()) / 3;
                color = new Color(averageColor, averageColor,
                        averageColor);

                // update the pixel's color to the new color 
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void monochromeRedFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                // create a Color obj using the RGB values of the pixel as a starting point 
                Color color = new Color(pixel, true);

                // modify the RGB values of the color 
                // the code below inverts colors 
                color = new Color(color.getRed(), color.getRed(),
                        color.getRed());

                // update the pixel's color to the new color 
                // this code directly modifies the BufferedImage
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void monochromeGreenFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                int pixel = image.getRGB(x, y);

                Color color = new Color(pixel, true);

                color = new Color(color.getGreen(), color.getGreen(),
                        color.getGreen());

                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void monochromeBlueFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                int pixel = image.getRGB(x, y);

                Color color = new Color(pixel, true);

                color = new Color(color.getBlue(), color.getBlue(),
                        color.getBlue());

                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void sephia(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                Color color = new Color(pixel, true);

                double luminence = (0.3 * color.getRed()) + (0.59 * color.getGreen()) + (0.11 * color.getBlue());

                int originalRed = color.getRed();
                //int originalGreen = color.getGreen();
                int originalBlue = color.getBlue();

                int resultRed = color.getRed();
                int resultGreen = (int) luminence;
                int resultBlue = color.getBlue();


                if (originalRed <= 62) {
                    resultRed = (int) (luminence * 1.1);
                } else if (originalRed >= 63 && originalRed <= 192) {
                    resultRed = (int) (luminence * 1.15);
                } else {
                    resultRed = (int) (luminence * 1.07);
                }
                if (resultRed > 255) {
                    resultRed = 255;
                }
                //skip skip green

                if (originalBlue <= 62) {
                    resultBlue = (int) (luminence * 0.9);
                } else if (originalBlue >= 63 && originalRed <= 192) {
                    resultBlue = (int) (luminence * 0.85);
                } else {
                    resultBlue = (int) (luminence * 0.93);
                }
                if (resultBlue > 255) {
                    resultBlue = 255;
                }
                
                color = new Color(resultRed, resultGreen, resultBlue);
                
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void valencia(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                Color color = new Color(pixel, true);

                int originalRed = color.getRed();
                int originalGreen = color.getGreen();
                int originalBlue = color.getBlue();

                int resultRed = color.getRed();
                int resultGreen = color.getGreen();
                int resultBlue = color.getBlue();

                if (originalRed <= 62) {
                    resultRed = (int) ((originalRed + 15) * 1.1);
                } else if (originalRed >= 63 && originalRed <= 192) {
                    resultRed = (int) ((originalRed + 15) * 1);
                } else {
                    resultRed = (int) ((originalRed + 15) * 0.9);
                }
                if (resultRed > 255) {
                    resultRed = 255;
                }

                if (originalGreen <= 62) {
                    resultGreen = (int) ((originalGreen + 15) * 1.1);
                } else if (originalGreen >= 63 && originalGreen <= 192) {
                    resultGreen = (int) ((originalGreen + 15) * 1);
                } else {
                    resultGreen = (int) ((originalGreen + 15) * 0.9);
                }
                if (resultGreen > 255) {
                    resultGreen = 255;
                }

                if (originalBlue <= 62) {
                    resultBlue = (int) ((originalBlue + 15) * 1.1);
                } else if (originalBlue >= 63 && originalBlue <= 192) {
                    resultBlue = (int) ((originalBlue + 15) * 1);
                } else {
                    resultBlue = (int) ((originalBlue + 15) * 0.9);
                }
                if (originalBlue > 255) {
                    resultBlue = 255;
                }
                
                
                color = new Color(resultRed, resultGreen, resultBlue);
                
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void valencia2(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

               // grab the RGB color values of an individual pixel
                int pixel = image.getRGB(x, y);

                Color color = new Color(pixel, true);

                int originalRed = color.getRed();
                int originalGreen = color.getGreen();
                int originalBlue = color.getBlue();

                int resultRed = color.getRed();
                int resultGreen = color.getGreen();
                int resultBlue = color.getBlue();

                if (originalRed <= 62) {
                    resultRed = (int) ((originalRed + 44) * 1.3);
                } else if (originalRed >= 63 && originalRed <= 192) {
                    resultRed = (int) ((originalRed + 44) * 1);
                } else {
                    resultRed = (int) ((originalRed + 44) * 0.8);
                }
                if (resultRed > 255) {
                    resultRed = 255;
                }

                if (originalGreen <= 62) {
                    resultGreen = (int) ((originalGreen + 22) * 1.3);
                } else if (originalGreen >= 63 && originalGreen <= 192) {
                    resultGreen = (int) ((originalGreen + 22) * 1);
                } else {
                    resultGreen = (int) ((originalGreen + 22) * 0.8);
                }
                if (resultGreen > 255) {
                    resultGreen = 255;
                }

                if (originalBlue <= 62) {
                    resultBlue = (int) ((originalBlue + 0) * 1.3);
                } else if (originalBlue >= 63 && originalBlue <= 192) {
                    resultBlue = (int) ((originalBlue + 0) * 1);
                } else {
                    resultBlue = (int) ((originalBlue + 0) * 0.8);
                }
                if (originalBlue > 255) {
                    resultBlue = 255;
                }
                
                
                color = new Color(resultRed, resultGreen, resultBlue);
                
                image.setRGB(x, y, color.getRGB());
            }
        }
    }

    public static void leftMirror(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        int leftxPos = width / 2;
        for (int x = width / 2; x < width && leftxPos >= 0; x++) { //this is placing things on the right
            for (int y = 0; y < height; y++) {
                int pixel = image.getRGB(leftxPos, y);
                Color color = new Color(pixel, true);
                // ^ don't touch ^

                image.setRGB(x, y, color.getRGB());
            }
            leftxPos--;
        }
    }

    public static void rightMirror(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int mid = width / 2;

        int rightxPos = width - 1;
        for (int x = 0; x < mid && rightxPos > mid; x++) { //this is placing things on the left
            for (int y = 0; y < height; y++) {
                int pixel = image.getRGB(rightxPos, y);
                Color color = new Color(pixel, true);

                image.setRGB(x, y, color.getRGB());
            }
            rightxPos--;
        }
    }
}
