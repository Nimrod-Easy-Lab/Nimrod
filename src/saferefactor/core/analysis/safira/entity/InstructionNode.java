package saferefactor.core.analysis.safira.entity;

import org.objectweb.asm.Handle;

public class InstructionNode {
	
	int type = -1;
     int nLocal = -1;
     Object[] local = null;
     int nStack = -1;
     Object[] stack = null;
     int opcode = -1;
     int operand = -1;
     int var = -1;
     //obs: mesmo nome: type
     String typeS = null;
      String owner = null;
      String name = null;
      String desc = null;
      Handle bsm = null;
      Object bsmArgs = null;
    //  Label label = null;
      Object cst = null;
      int increment = -1;
       int min = -1;
       int max = -1;
     //  Label dflt = null;
        int[] keys = null;
        int dims = -1;
//        Label start = null;
//         Label end = null;
//         Label handler = null;
          String signature = null;
          int index = -1;
          int line = -1;
          int maxStack = -1; 
           int maxLocals = -1;
//           Label[] labels = null;
           String nodeType = null;
           
	
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public int getnLocal() {
			return nLocal;
		}
		public void setnLocal(int nLocal) {
			this.nLocal = nLocal;
		}
		public Object[] getLocal() {
			return local;
		}
		public void setLocal(Object[] local) {
			this.local = local;
		}
		public int getnStack() {
			return nStack;
		}
		public void setnStack(int nStack) {
			this.nStack = nStack;
		}
		public Object[] getStack() {
			return stack;
		}
		public void setStack(Object[] stack) {
			this.stack = stack;
		}
		public int getOpcode() {
			return opcode;
		}
		public void setOpcode(int opcode) {
			this.opcode = opcode;
		}
		public int getOperand() {
			return operand;
		}
		public void setOperand(int operand) {
			this.operand = operand;
		}
		public int getVar() {
			return var;
		}
		public void setVar(int var) {
			this.var = var;
		}
		public String getTypeS() {
			return typeS;
		}
		public void setTypeS(String typeS) {
			this.typeS = typeS;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Handle getBsm() {
			return bsm;
		}
		public void setBsm(Handle bsm) {
			this.bsm = bsm;
		}
		public Object getBsmArgs() {
			return bsmArgs;
		}
		public void setBsmArgs(Object bsmArgs) {
			this.bsmArgs = bsmArgs;
		}
	
		public Object getCst() {
			return cst;
		}
		public void setCst(Object cst) {
			this.cst = cst;
		}
		public int getIncrement() {
			return increment;
		}
		public void setIncrement(int increment) {
			this.increment = increment;
		}
		public int getMin() {
			return min;
		}
		public void setMin(int min) {
			this.min = min;
		}
		public int getMax() {
			return max;
		}
		public void setMax(int max) {
			this.max = max;
		}
		public String getNodeType() {
			return nodeType;
		}
		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}
		public int[] getKeys() {
			return keys;
		}
		public void setKeys(int[] keys) {
			this.keys = keys;
		}
		public int getDims() {
			return dims;
		}
		public void setDims(int dims) {
			this.dims = dims;
		}
		public String getSignature() {
			return signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getLine() {
			return line;
		}
		public void setLine(int line) {
			this.line = line;
		}
		public int getMaxStack() {
			return maxStack;
		}
		public void setMaxStack(int maxStack) {
			this.maxStack = maxStack;
		}
		public int getMaxLocals() {
			return maxLocals;
		}
		public void setMaxLocals(int maxLocals) {
			this.maxLocals = maxLocals;
		}
		
		public boolean arrayEquals(Object[] array1, Object[] array2) {
			if (array1.length == array2.length) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[j] == null &&  array2[j] != null) {
						return false;
					}
					if (array1[j] != null &&  array2[j] == null) {
						return false;
					}
					if (!(array1[j] == null &&  array2[j] == null)) {
						if (!array1[j].equals(array2[j])) {
							return false;
						}
					}
					
				}
			} else {
				return false;
			}
			return true;
			
		}
		public boolean arrayEquals(int[] array1, int[] array2) {
			if (array1.length == array2.length) {
				for (int j = 0; j < array2.length; j++) {
					if (!(array1[j] == array2[j])){
						return false;
					}
				}
			} else {
				return false;
			}
			return true;
			
		}
		
		public boolean equals(InstructionNode i) {
			
			if (!i.getNodeType().equals(this.getNodeType())) {
				return false;
			}
			
			if (i.getBsm() != null && this.getBsm() != null && !i.getBsm().equals(this.getBsm())) {
				return false;
			}
			if (i.getBsmArgs() != null && this.getBsmArgs() != null && !i.getBsmArgs().equals(this.getBsmArgs())) {
				return false;
			}
			if (i.getCst() != null && this.getCst() != null && !i.getCst().equals(this.getCst())) {
				return false;
			}
			if (i.getDesc() != null && this.getDesc() != null && !i.getDesc().equals(this.getDesc())) {
				return false;
			}
//			if (i.getDflt() != null && this.getDflt() != null && !i.getDflt().equals(this.getDflt())) {
//				return false;
//			}
			if (!(i.getDims() == this.getDims())) {
				return false;
			}
//			if (i.getEnd() != null && this.getEnd()!= null && !(i.getEnd().equals(this.getEnd()))) {
//				return false;
//			}
//			if (i.getHandler() != null && this.getHandler() != null && !(i.getHandler().equals(this.getHandler()))) {
//				return false;
//			}
			if (!(i.getIncrement() == this.getIncrement())) {
				return false;
			}
			if (!(i.getIndex() == this.getIndex())) {
				return false;
			}
			//opa, ver se realmente Ž verdadeiro, pq Ž um array
			if (i.getKeys() != null && this.getKeys() != null && !arrayEquals(i.getKeys(), this.getKeys())) {
				return false;
			}
//			if (i.getLabel() != null && this.getLabel() != null && !(i.getLabel().equals(this.getLabel()))) {
//				return false;
//			}
			if (!(i.getLine() == this.getLine())) {
				return false;
			}
			//opa, array
			if (i.getLocal() != null && this.getLocal() != null && !arrayEquals(i.getLocal(), this.getLocal())){
				return false;
			}
			if (!(i.getMax() == this.getMax())) {
				return false;
			}
			if (!(i.getMaxLocals() == this.getMaxLocals())) {
				return false;
			}
			if (!(i.getMaxStack() == this.getMaxStack())) {
				return false;
			}
			if (!(i.getMin() == this.getMin())) {
				return false;
			}
			if (i.getName() != null && this.getName() != null && !(i.getName().equals(this.getName()))) {
				return false;
			}
			if (!(i.getnLocal() == this.getnLocal())) {
				return false;
			}
			if (!(i.getnStack() == this.getnStack())) {
				return false;
			}
			if (!(i.getOpcode() == this.getOpcode())) {
				return false;
			}
			if (!(i.getOperand() == this.getOperand())) {
				return false;
			}
			if (i.getOwner() != null && this.getOwner() != null && !(i.getOwner().equals(this.getOwner()))) {
				return false;
			}
			if (i.getSignature() != null && this.getSignature() != null && !(i.getSignature().equals(this.getSignature()))) {
				return false;
			}
			//opa, array
			
			if (i.getStack() != null && this.getStack() != null && !arrayEquals(i.getStack(), this.getStack()) ){
				return false;
			}
//			if (i.getStart() != null && this.getStart() != null && !(i.getStart().equals(this.getStart()))) {
//				return false;
//			}
			if (!(i.getType() == this.getType())) {
				return false;
			}
			if (i.getTypeS() != null && this.getTypeS() != null && !(i.getTypeS().equals(this.getTypeS()))) {
				return false;
			}
			if (!(i.getVar() == this.getVar())) {
				return false;
			}
			//opa, array
//			if (i.getLabels()!= null && this.getLabels() != null && !i.getLabels().equals(this.getLabels())) {
//				return false;
//			}
			
			return true;
		}
		
}
