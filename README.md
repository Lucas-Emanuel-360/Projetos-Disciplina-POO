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
