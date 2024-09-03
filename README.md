Este projeto simula as funcionalidades básicas de um iPhone, incluindo as interfaces para um reprodutor musical, um aparelho telefônico e um navegador de internet. O projeto é implementado em Java e é composto por duas classes principais:

- `App`: Define as interfaces para as funcionalidades do iPhone.
- `Iphone`: Implementa as interfaces definidas na classe `App`.

## Estrutura do Projeto

### Classe `App`

A classe `App` contém as seguintes interfaces:

- **`ReprodutorMusical`**: Define os métodos para controlar a reprodução de música.
  - `void tocar()`
  - `void pausar()`
  - `void selecionarMusica(String musica)`

- **`AparelhoTelefonico`**: Define os métodos para funcionalidades telefônicas.
  - `void ligar(String numero)`
  - `void atender()`
  - `void iniciarCorreioDeVoz()`

- **`NavegadorInternet`**: Define os métodos para navegação na internet.
  - `void exibirPagina(String url)`
  - `void adicionarNovaGuia()`
  - `void atualizarPagina()`
 
### Classe `Iphone`

A classe `Iphone` implementa todas as interfaces definidas na classe `App`. Cada método da interface é implementado para simular as funcionalidades descritas.

#### Implementações:

- **Métodos de `ReprodutorMusical`**
  - `tocar()`: Imprime uma mensagem indicando que a música está tocando.
  - `pausar()`: Imprime uma mensagem indicando que a música foi pausada.
  - `selecionarMusica(String musica)`: Imprime uma mensagem indicando a música selecionada.

- **Métodos de `AparelhoTelefonico`**
  - `ligar(String numero)`: Imprime uma mensagem indicando o número para o qual está ligando.
  - `atender()`: Imprime uma mensagem indicando que a chamada está sendo atendida.
  - `iniciarCorreioDeVoz()`: Imprime uma mensagem indicando que o correio de voz está sendo iniciado.

- **Métodos de `NavegadorInternet`**
  - `exibirPagina(String url)`: Imprime uma mensagem indicando a página que está sendo exibida.
  - `adicionarNovaGuia()`: Imprime uma mensagem indicando que uma nova guia foi adicionada.
  - `atualizarPagina()`: Imprime uma mensagem indicando que a página foi atualizada.
