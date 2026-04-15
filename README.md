# ☕ Projetos de Programação Orientada a Objetos (POO)

Este repositório contém os projetos desenvolvidos durante a disciplina de Programação Orientada a Objetos (POO). Todos os sistemas foram construídos utilizando a linguagem **Java**, com o objetivo de colocar em prática os principais conceitos do paradigma orientado a objetos.

---

## 🚗 Projeto 1: EcoDrive Realizado de (14/03/2026 a 01/04/2026)

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

## 💻 Projeto 2: SpaceShare Realizado de (02/04/2026 a 15/04/2026)

O **SpaceShare** é um sistema de gerenciamento de estações de trabalho compartilhadas. O objetivo principal do projeto é controlar a alocação de usuários nas máquinas, otimizando o tempo de uso e aplicando regras de segurança para evitar desgaste do equipamento.

### 📋 Funcionalidades

O sistema simula o controle de agendamentos diários em um ambiente de coworking ou laboratório:
* **Gestão de Reservas:** Registro de usuários atrelados à quantidade de horas que pretendem utilizar a estação.
* **Controle de Capacidade:** Monitoramento contínuo das horas já reservadas em cada máquina.
* **Validação de Regras de Negócio:**
    * Limitar o uso diário de cada estação a um máximo de **10 horas**, prevenindo sobrecarga de energia e reduzindo custos de manutenção.
    * Aprovar automaticamente reservas que se encaixem no tempo limite.
    * Rejeitar e bloquear tentativas de reserva que excedam a capacidade diária disponível.
* **Relatórios e Status:** Geração do "Mapa de Uso", exibindo o número da estação de trabalho, a lista de usuários agendados para aquele dia e o tempo de ocupação individual.
