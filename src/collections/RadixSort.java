package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

public class RadixSort {
    public static void main(String[] args) {
        int[]  iArr = {16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for(int i : iArr){
            System.out.println(i + " ");
        }
    }

    private static int[] radixSort(int[] iArr) {

        //1- Passar o vetor recebido como paramento, para um vetor de String

        String [] sArr = new String[iArr.length];

        IntSummaryStatistics stat = Arrays.stream(iArr).summaryStatistics();
        int iArrMaxValue = stat.getMax(); //Armazeno o maior valor numerico do Array
        int iArrMaxValueLength = String.valueOf(iArrMaxValue).length(); //Pego a quantidade de algarismos do meu valor maior


        //2- Completar o meu sArr com 0 a esquerda, para que fique com a mesma quantidade de algarismos que meu iArrMaxValue
        for (int i = 0; i < iArr.length; i++){
            sArr[i] = String.format("%0" + iArrMaxValueLength+ "d", iArr[i]);
        }

        //3- Criar listas auxiliares, essas listas serviram para  armazenar os numeros de acordo com o final deles (0 = l0) (3=l3)
        List<String> L0 = new ArrayList<>();
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        List<String> L4 = new ArrayList<>();
        List<String> L5 = new ArrayList<>();
        List<String> L6 = new ArrayList<>();
        List<String> L7 = new ArrayList<>();
        List<String> L8 = new ArrayList<>();
        List<String> L9 = new ArrayList<>();

        HashMap<Integer, List<String>> hm  = new HashMap<>();

        String [] LS = new String[iArr.length];

        // A cada iteração, avaliamos e classificamos os elementos de acordo com o seu ultimo, penultimo, antepenultimo e assim por diante
        // Depois o vetor sera ordenado
        for (int j = 1; j <= iArrMaxValueLength; j++){

            //Percorrer sArr[] para cada elemento, verificar o ultimo digito e adicionar a lista correspondente, L0,L2...L9
            for (int i = 0 ; i < iArr.length; i++ ){

                String sValue = sArr[i];
                String sCharValue = Character.toString(sValue.charAt(iArrMaxValueLength - j));

                switch (sCharValue) {
                    case "0":
                        L0.add(sValue);
                        hm.put(0,L0);
                        break;

                    case "1":
                        L1.add(sValue);
                        hm.put(1,L1);
                        break;

                    case "2":
                        L2.add(sValue);
                        hm.put(2,L2);
                        break;

                    case "3":
                        L3.add(sValue);
                        hm.put(3,L3);
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
    ;       }

            //5- Percorre as Listas em ordem: L0,L1...L9, e carregar os elementos de cada uma
            List<String> groupValues = new ArrayList<>();

            for (Map.Entry<Integer, List<String>> entry: hm.entrySet()){
                groupValues.addAll(entry.getValue());
            }

            for(int i = 0; i<groupValues.size(); i++){
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

            /*
            Semelhante ao passo 04, agora vamos trabalhar com o penultimo digito. L0 = sera a lista, cujo elementos tenha 0
            em seu penultimo digito... assim por diante
             */
        }

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }

        return iArr;
    }
}
