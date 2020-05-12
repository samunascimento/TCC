/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller;

import br.ufjf.dcc.gmr.core.conflictanalysis.model.ConflictRegion;
import br.ufjf.dcc.gmr.core.vcs.types.OutmostInformation;
import br.ufjf.dcc.gmr.core.vcs.types.OutmostTypes;
import java.util.ArrayList;
import java.util.List;

/**
 * Test class for outmost
 *
 * @author luan
 */
public class OutmostJava {

    List<OutmostInformation> save;

    public OutmostJava() {

        save = new ArrayList<>();

    }

    public List<OutmostInformation> process(ConflictRegion output) {

        String[] structureTypesV1 = null, structureTypesV2 = null;
        if (!output.getV1StructureTypes().contains("V1 doesn't has any structure type!") && !output.getV1StructureTypes().contains("Extension not parseble,or file don't\nexists in this version,impossible to get syntax structures!")) {
            structureTypesV1 = output.getV1StructureTypes().split(", ");
        }
        if (!output.getV2StructureTypes().contains("V2 doesn't has any structure type!") && !output.getV2StructureTypes().contains("Extension not parseble,or file don't\nexists in this version,impossible to get syntax structures!")) {
            structureTypesV2 = output.getV2StructureTypes().split(", ");
        }

        if (null == structureTypesV1) {
            OutmostInformation aux;
            aux = new OutmostInformation(OutmostTypes.Error);
            save.add(aux);
        } else {
            for (String string : structureTypesV1) {

                if (string.equals("variable")) {
                    OutmostInformation aux;
                    aux = new OutmostInformation(OutmostTypes.Variable);
                    save.add(aux);
                }

            }
        }
        if (null == structureTypesV2) {
            OutmostInformation aux;
            aux = new OutmostInformation(OutmostTypes.Error);
            save.add(aux);
        } else {
            for (String string : structureTypesV2) {

            }
        }
        return save;
    }
}
