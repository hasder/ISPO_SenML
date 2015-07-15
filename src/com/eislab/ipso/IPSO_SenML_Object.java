package com.eislab.ipso;

public class IPSO_SenML_Object {
		private String n; //name
		private double v; //value (double)
		private String sv; //value (string)
		private boolean bv;//value (boolean)
		private String u; //units
		private int t; //time of recorded reading since 1970
		private int ut; //maximum number of seconds before this sensor will provide an updated value
		
///todo: Need to make only v or bv or sv get serialized when creating the JSON IPSO object		
		public String getN() {
			return n;
		}
		public void setN(String n) {
			this.n = n;
		}
		public double getV() {
			return v;
		}
		public void setV(double v) {
			this.v = v;
		}
		public String getSv() {
			return sv;
		}
		public void setSv(String sv) {
			this.sv = sv;
		}
		public boolean isBv() {
			return bv;
		}
		public void setBv(boolean bv) {
			this.bv = bv;
		}
		public String getU() {
			return u;
		}
		public void setU(String u) {
			this.u = u;
		}
		public int getT() {
			return t;
		}
		public void setT(int t) {
			this.t = t;
		}
		public int getUt() {
			return ut;
		}
		public void setUt(int ut) {
			this.ut = ut;
		}
}
