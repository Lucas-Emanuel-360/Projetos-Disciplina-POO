# ☕ Projetos de Programação Orientada a Objetos (POO)

Este repositório contém os projetos desenvolvidos durante a disciplina de Programação Orientada a Objetos (POO). Todos os sistemas foram construídos utilizando a linguagem **Java**, com o objetivo de colocar em prática os principais conceitos do paradigma orientado a objetos.

---

## 🚗 Projeto 1: EcoDrive (Realizado de 14/03/2026 a 01/04/2026)

O **EcoDrive** é um sistema de simulação de gerenciamento de frotas. O objetivo principal do projeto é controlar o uso de veículos, gerenciar o consumo de combustível e aplicar regras de negócio em relação aos motoristas autorizados a dirigi-los.

### 📋 Funcionalidades

O sistema simula diversos cenários do dia a dia de uma frota:
* **Gestão de Combustível:** Abastecimento de veículos respeitando a capacidade máxima do tanque (50 Litros).
* **Controle de Viagens:** Registro de viagens calculando o consumo estimado (10 km/L) e atualizando o odômetro.
* **Validação de Regras de Negócio:**
    * Impedir viagens em veículos sem motoristas vinculados.
    * Impedir viagens se não houver combustível suficiente.
    * **Validação de CNH:** Apenas motoristas com CNH da categoria **'D'** podem assumir os veículos da frota.
* **Troca de Turno/Motorista:** Desvinculação automática do motorista anterior ao atribuir um novo motorista ao veículo.
* **Relatórios e Status:** Exibição do status atual do veículo (placa, modelo, motorista, tanque e odômetro) e geração de histórico de viagens com datas e distâncias.

---

## 💻 Projeto 2: SpaceShare (Realizado de 02/04/2026 a 15/04/2026)

O **SpaceShare** é um sistema de gerenciamento de estações de trabalho compartilhadas. O objetivo principal do projeto é controlar a alocação de usuários nas máquinas, otimizando o tempo de uso e aplicando regras rigorosas de concorrência de horários.

### 📋 Funcionalidades

O sistema simula o controle de agendamentos dinâmicos em um ambiente de coworking ou laboratório:
* **Gestão de Reservas:** Registro de usuários atrelados a um horário exato de início e uma duração prevista de uso (utilizando `LocalTime`).
* **Controle Dinâmico de Capacidade:** O sistema permite a alocação contínua da estação ao longo do dia, sem limite fixo de horas totais, desde que não haja sobreposição de horários.
* **Validação de Regras de Negócio (Prevenção de Conflitos):**
    * **Lógica de Intersecção:** O sistema impede novas reservas caso o intervalo (Início ao Término) coincida com qualquer reserva já existente na lista.
    * A regra aplicada garante que: `(Nova_Inicio < Existente_Termino) AND (Nova_Termino > Existente_Inicio)`.
    * Aprovação imediata de reservas em horários sequenciais (ex: uma reserva termina às 10h e outra começa exatamente às 10h).
* **Relatórios e Status:** Geração do "Mapa de Uso", exibindo o número da estação, a lista de usuários confirmados e os respectivos intervalos de ocupação (ex: 08:00 às 10:00).
