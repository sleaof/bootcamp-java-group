package Aula1pt2TT;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

    public class RadixSort {

        public static int[] radixSort(int iArr[]) {
            String sArr[] = new String[iArr.length];
            //Calcula quantidade/ soma/ menor numero/media/maior numero
            IntSummaryStatistics stat = Arrays.stream(iArr).summaryStatistics();
            //Pega o maior numero
            int iArrMaxValue = stat.getMax();
            //Pega quantidade de digitos
            int iArrMaxValueLength = String.valueOf(iArrMaxValue).length();
            //vai percorrer pela array adicionando zeros a frente para os numeros que nao tem quantidade de digitos que o maior numero
            for (int i = 0; i < iArr.length; i++) {
                sArr[i] = String.format("%0" + iArrMaxValueLength + "d", iArr[i]);
            }

            List<String> L0 = new ArrayList<String>();
            List<String> L1 = new ArrayList<String>();
            List<String> L2 = new ArrayList<String>();
            List<String> L3 = new ArrayList<String>();
            List<String> L4 = new ArrayList<String>();
            List<String> L5 = new ArrayList<String>();
            List<String> L6 = new ArrayList<String>();
            List<String> L7 = new ArrayList<String>();
            List<String> L8 = new ArrayList<String>();
            List<String> L9 = new ArrayList<String>();
            System.out.println(L1);
            HashMap<Integer, List<String>> hm = new HashMap<>();

            String LS[] = new String[iArr.length];

            for (int j = 1; j <= iArrMaxValueLength; j++) {
                System.out.println(j);
                for (int i = 0; i < iArr.length; i++) {
                    System.out.println(i);
                    String sValue = sArr[i];
                    System.out.println(sValue);
                    String sCharValue = Character.toString(sValue.charAt(iArrMaxValueLength - j));

                    switch (sCharValue) {
                        case "0":
                            L0.add(sValue);
                            hm.put(0, L0);
                            break;
                        case "1":
                            L1.add(sValue);
                            hm.put(1, L1);
                            break;
                        case "2":
                            L2.add(sValue);
                            hm.put(2, L2);
                            break;
                        case "3":
                            L3.add(sValue);
                            hm.put(3, L3);
                            break;
                        case "4":
                            L4.add(sValue);
                            hm.put(4, L4);
                            break;
                        case "5":
                            L5.add(sValue);
                            hm.put(5, L5);
                            break;
                        case "6":
                            L6.add(sValue);
                            hm.put(6, L6);
                            break;
                        case "7":
                            L7.add(sValue);
                            hm.put(7, L7);
                            break;
                        case "8":
                            L8.add(sValue);
                            hm.put(8, L8);
                            break;
                        case "9":
                            L9.add(sValue);
                            hm.put(9, L9);
                            break;
                    }
                }

                List<String> groupValues = new ArrayList<String>();
                for (Map.Entry<Integer, List<String>> entry : hm.entrySet()) {
                    groupValues.addAll(entry.getValue());
                }

                for (int i = 0; i < groupValues.size(); i++) {
                    LS[i] = groupValues.get(i);
                }

                sArr = LS;

                hm.clear();
                L0.clear();
                L1.clear();
                L2.clear();
                L3.clear();
                L4.clear();
                L5.clear();
                L6.clear();
                L7.clear();
                L8.clear();
                L9.clear();
            }

            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = Integer.parseInt(sArr[i]);
            }

            return iArr;
        }

        public static void main(String[] args) {

            int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };

            radixSort(iArr);

            for (int i : iArr) {
                System.out.print(i + " ");
            }
        }


}
