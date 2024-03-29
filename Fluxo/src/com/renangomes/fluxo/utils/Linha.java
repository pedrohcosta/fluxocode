/**
 * Fluxo: Uma Ferramenta Visual para Auxílio ao Ensino de Programação
 * Copyright (C) 2012 Renan Gomes (email@renangomes.com), Pedro Dantas (tigreped@gmail.com)
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/** 
 * Aquivo: Linha.java
 * Autor: Renan Gomes Barreto
 * Data de Criação: 11:36:03 09/09/2011
 * Data de Modificação: 09/09/2011
 * Codificacao: UTF-8
 */
package com.renangomes.fluxo.utils;

import com.renangomes.fluxo.utils.Linguagem.Token;

/**
 * Esta Classe representa o Linha
 * @since 09/09/2011
 * @author Renan Gomes Barreto
 */
public class Linha {
    
    /** A string encontrada no codigo*/
    public String token;
    /** O Tipo de Token */
    public Token tipo;
    /** o numero da linha que o token se encontra */
    public int numeroDaLinha;
    public int caractereInicial = 0;

    /** O contrutor padrão da classe Linha */
    public Linha(String l, Token t, int n, int ci) {
        token = l;
        tipo = t;
        numeroDaLinha = n;
        caractereInicial = ci;
    }
    
    /**
     * Tranforma a linha em uma string bem espaçada
     * (Essa função é usada apenas para mostrar na tela a tabela de linhas)
     * @return Uma linha com tamanho fixo e com os dados da linha
     */
    @Override
    public String toString() {
        String saida = Integer.toString(numeroDaLinha);
        for (int i = saida.length(); i <= 10; i++) {
            saida += ' ';
        }
        saida += token;
        for (int i = saida.length(); i <= 30; i++) {
            saida += ' ';
        }
        saida += tipo;
        for (int i = saida.length(); i <= 50; i++) {
            saida += ' ';
        }
        return saida;
    }
}