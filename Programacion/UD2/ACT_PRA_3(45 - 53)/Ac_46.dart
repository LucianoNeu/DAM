import 'dart:io';

void main() {
  List<int> lista = List.filled(3, 0);
  String varIn;

  bool lp;
  do {
    lp = false;
    for (int i = 0; i < lista.length; i++) {
        print("Introduce el numero ${i + 1}: ");
        lista[i] = int.parse(stdin.readLineSync()!);
    }
    print("Como quieres ordenarlos?");
    print("1. De menor a mayor.");
    print("2. De mayor a menor.");
    print("Introduce una opcion: ");
    varIn = stdin.readLineSync()!;

    int temp = 0;
    int bubble = 1;
    switch (varIn) {
    case "1":
        while (bubble != 0) {
            bubble = 0;
            for (int i = 0; i < (lista.length - 1); i++) {
                if (lista[i] > lista[i + 1]) {
                    temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                    bubble += 1;
            }
          }
        }
        break;
    case "2":
        while (bubble != 0) {
            bubble = 0;
            for (int i = 0; i < (lista.length - 1); i++) {
                if (lista[i] < lista[i + 1]) {
                    temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                    bubble += 1;
            }
          }
        }
        break;
      default:
        print("Valor no valido.");
        lp = true;
        break;
    }

    print("La lista ordenada es: ${lista.join(' ')}");
    print("\n");
    print("Quieres volver a ordenar(Y/N): ");
    varIn = stdin.readLineSync()!;
    if (varIn.toLowerCase() == "y") {
      lp = true;
    }
  } while (lp);
} 