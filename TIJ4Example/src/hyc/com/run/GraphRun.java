package hyc.com.run;

import java.util.Scanner;

public class GraphRun {
	public GraphRun() {
		System.out.println("***************************************************");
		System.out.println("* This is an example package of Thinking in Java! *");
		System.out.println("***************************************************");
		while (LoadMenu())
			;
	}

	private String readString(String prompt) {
		System.out.print(prompt);
		return new Scanner(System.in).nextLine();
	}

	private int readNumber(String prompt) {
		String paragraph = readString(prompt);
		try {
			return Integer.parseInt(paragraph);
		} catch (Exception e) {
			if (paragraph.equals("q")) {
				return -1;
			} else {
				System.out.println();
				System.out.println();
				System.out.println("*************************************");
				System.out.println("**          Wrong number!          **");
				System.out.println("*************************************");
				return 0;
			}
		}

	}

	private boolean LoadMenu() {
		System.out.println();
		System.out.println("********");
		System.out.println("* Menu *");
		System.out.println("********");
		System.out.println("01.Introduction to Objects");
		System.out.println("02.Everything Is an Object");
		System.out.println("03.Operators");
		System.out.println("04.Controlling Execution");
		System.out.println("05.Initialization & Cleanup");
		System.out.println("06.Access Control");
		System.out.println("07.Reusing Classes");
		System.out.println("08.Polymorphism");
		System.out.println("09.Interfaces");
		System.out.println("10.Inner Classes");
		System.out.println("11.Holding Your Objects");
		System.out.println("12.Error Handling with Exceptions");
		System.out.println("13.Strings");
		System.out.println("14.Type Information");
		System.out.println("15.Generics");
		System.out.println("16.Arrays");
		System.out.println("17.Containers in Depth");
		System.out.println("18.I/O");
		System.out.println("19.Enumerated Types");
		System.out.println("20.Annotations");
		System.out.println("21.Concurrency");
		System.out.println("22.Graphical User Interfaces");
		System.out.println("*************************************");
		int keyParagraph = readNumber("Please input the number of paragraph:");
		if (keyParagraph == -1) {
			return false;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*************************************");
		switch (keyParagraph) {
		case 1:
			LoadParagraph1();
			break;
		case 2:
			LoadParagraph2();
			break;
		case 3:
			LoadParagraph3();
			break;
		case 4:
			LoadParagraph4();
			break;
		case 5:
			LoadParagraph5();
			break;
		case 6:
			LoadParagraph6();
			break;
		case 7:
			LoadParagraph7();
			break;
		case 8:
			LoadParagraph8();
			break;
		case 9:
			LoadParagraph9();
			break;
		case 10:
			LoadParagraph10();
			break;
		case 11:
			LoadParagraph11();
			break;
		case 12:
			LoadParagraph12();
			break;
		case 13:
			LoadParagraph13();
			break;
		case 14:
			LoadParagraph14();
			break;
		case 15:
			LoadParagraph15();
			break;
		case 16:
			LoadParagraph16();
			break;
		case 17:
			LoadParagraph17();
			break;
		case 18:
			LoadParagraph18();
			break;
		case 19:
			LoadParagraph19();
			break;
		case 20:
			LoadParagraph20();
			break;
		case 21:
			LoadParagraph21();
			break;
		case 22:
			LoadParagraph22();
			break;
		default:
			System.out.println();
			System.out.println();
			System.out.println("*************************************");
			System.out.println("**         Wrong paragraph!        **");
			System.out.println("*************************************");
			return true;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*************************************");
		System.out.println("**    Do you want continue?(Y/N)   **");
		System.out.println("*************************************");
		String wantContinue = readString("");
		if (wantContinue.equals("y") || wantContinue.equals("Y")) {
			return true;
		}
		return false;
	}

	private void LoadParagraph1() {
		System.out.println("01.Introduction to Objects");
		System.out.println("*************************************");
	}

	private void LoadParagraph2() {
		System.out.println("02.Everything Is an Object");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph3() {
		System.out.println("03.Operators");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P38");
		System.out.println("02.Precedence			P39");
		System.out.println("03.Assignment			P40");
		System.out.println("04.PassObject			P40");
		System.out.println("05.MathOps			P41");
		System.out.println("06.AutoInc			P43");
		System.out.println("07.Equivalence			P44");
		System.out.println("08.EqualsMethod			P44");
		System.out.println("09.EqualsMethod2		P45");
		System.out.println("10.Bool				P45");
		System.out.println("11.ShortCircuit			P46");
		System.out.println("12.Literals			P47");
		System.out.println("13.Exponents			P48");
		System.out.println("14.URShift			P50");
		System.out.println("15.BitManipulation		P50");
		System.out.println("16.TernaryIfElse		P53");
		System.out.println("17.StringOperators		P53");
		System.out.println("18.Casting			P54");
		System.out.println("19.CastingNumbers		P55");
		System.out.println("20.RoundingNumbers		P55");
		System.out.println("21.AllOps			P56");
		System.out.println("22.Overflow			P63");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph03.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph03.Precedence.Test();
			break;
		case 3:
			new thinking.paragraph03.Assignment.Test();
			break;
		case 4:
			new thinking.paragraph03.PassObject.Test();
			break;
		case 5:
			new thinking.paragraph03.MathOps.Test();
			break;
		case 6:
			new thinking.paragraph03.AutoInc.Test();
			break;
		case 7:
			new thinking.paragraph03.Equivalence.Test();
			break;
		case 8:
			new thinking.paragraph03.EqualsMethod.Test();
			break;
		case 9:
			new thinking.paragraph03.EqualsMethod2.Test();
			break;
		case 10:
			new thinking.paragraph03.Bool.Test();
			break;
		case 11:
			new thinking.paragraph03.ShortCircuit.Test();
			break;
		case 12:
			new thinking.paragraph03.Literals.Test();
			break;
		case 13:
			new thinking.paragraph03.Exponents.Test();
			break;
		case 14:
			new thinking.paragraph03.URShift.Test();
			break;
		case 15:
			new thinking.paragraph03.BitManipulation.Test();
			break;
		case 16:
			new thinking.paragraph03.TernaryIfElse.Test();
			break;
		case 17:
			new thinking.paragraph03.StringOperators.Test();
			break;
		case 18:
			new thinking.paragraph03.Casting.Test();
			break;
		case 19:
			new thinking.paragraph03.CastingNumbers.Test();
			break;
		case 20:
			new thinking.paragraph03.RoundingNumbers.Test();
			break;
		case 21:
			new thinking.paragraph03.AllOps.Test();
			break;
		case 22:
			new thinking.paragraph03.Overflow.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph4() {
		System.out.println("04.Controlling Execution");
		System.out.println("*************************************");
		System.out.println("01.IfElse			P64");
		System.out.println("02.WhileTest			P65");
		System.out.println("03.ListCharacters		P66");
		System.out.println("04.CommaOperator		P67");
		System.out.println("05.ForEachFloat			P67");
		System.out.println("06.ForEachString		P68");
		System.out.println("07.IfElse2			P69");
		System.out.println("08.BreakAndContinue		P70");
		System.out.println("09.LabeledFor			P71");
		System.out.println("10.LabeledWhile			P72");
		System.out.println("11.VowelsAndConsonants		P74");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph04.IfElse.Test();
			break;
		case 2:
			new thinking.paragraph04.WhileTest.Test();
			break;
		case 3:
			new thinking.paragraph04.ListCharacters.Test();
			break;
		case 4:
			new thinking.paragraph04.CommaOperator.Test();
			break;
		case 5:
			new thinking.paragraph04.ForEachFloat.Test();
			break;
		case 6:
			new thinking.paragraph04.ForEachString.Test();
			break;
		case 7:
			new thinking.paragraph04.IfElse2.Test();
			break;
		case 8:
			new thinking.paragraph04.BreakAndContinue.Test();
			break;
		case 9:
			new thinking.paragraph04.LabeledFor.Test();
			break;
		case 10:
			new thinking.paragraph04.LabeledWhile.Test();
			break;
		case 11:
			new thinking.paragraph04.VowelsAndConsonants.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph5() {
		System.out.println("05.Initialization & Cleanup");
		System.out.println("*************************************");
		System.out.println("01.SimpleConstructor		P76");
		System.out.println("02.SimpleConstructor2		P77");
		System.out.println("03.Overloading			P78");
		System.out.println("04.OverloadingOrder		P79");
		System.out.println("05.PrimitiveOverloading		P79");
		System.out.println("06.Demotion			P81");
		System.out.println("07.DefaultConstructor		P83");
		System.out.println("08.NoStnthesis			P83");
		System.out.println("09.BananaPeel			P84");
		System.out.println("10.Apricot			P84");
		System.out.println("11.Leaf				P84");
		System.out.println("12.PassingThis			P85");
		System.out.println("13.Flower			P85");
		System.out.println("14.TerminationCondition		P89");
		System.out.println("15.InitialValues		P92");
		System.out.println("16.InitialValues2		P93");
		System.out.println("17.Measurement			P93");
		System.out.println("18.MethodInit			P93");
		System.out.println("19.OrderOfInitialization	P94");
		System.out.println("20.StaticInitialization		P95");
		System.out.println("21.ExplicitStatic		P97");
		System.out.println("22.Mugs				P98");
		System.out.println("23.ArraysOfPrimitives		P99");
		System.out.println("24.ArrayNew			P100");
		System.out.println("25.ArrayClassObj		P100");
		System.out.println("26.ArrayInit			P101");
		System.out.println("27.DynamicArray			P101");
		System.out.println("28.VarArgs			P102");
		System.out.println("29.NewVarArgs			P102");
		System.out.println("30.OptionalTrailingArguments	P103");
		System.out.println("31.VarargType			P103");
		System.out.println("32.AutoboxingVarargs		P104");
		System.out.println("33.OverloadingVarargs		P104");
		System.out.println("34.OverloadingVarargs2		P105");
		System.out.println("35.OverloadingVarargs3		P105");
		System.out.println("36.SimpleEnumUse		P106");
		System.out.println("37.EnumOrder			P106");
		System.out.println("38.Burrito			P106");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph05.SimpleConstructor.Test();
			break;
		case 2:
			new thinking.paragraph05.SimpleConstructor2.Test();
			break;
		case 3:
			new thinking.paragraph05.Overloading.Test();
			break;
		case 4:
			new thinking.paragraph05.OverloadingOrder.Test();
			break;
		case 5:
			new thinking.paragraph05.PrimitiveOverloading.Test();
			break;
		case 6:
			new thinking.paragraph05.Demotion.Test();
			break;
		case 7:
			new thinking.paragraph05.DefaultConstructor.Test();
			break;
		case 8:
			new thinking.paragraph05.NoStnthesis.Test();
			break;
		case 9:
			new thinking.paragraph05.BananaPeel.Test();
			break;
		case 10:
			new thinking.paragraph05.Apricot.Test();
			break;
		case 11:
			new thinking.paragraph05.Leaf.Test();
			break;
		case 12:
			new thinking.paragraph05.PassingThis.Test();
			break;
		case 13:
			new thinking.paragraph05.Flower.Test();
			break;
		case 14:
			new thinking.paragraph05.TerminationCondition.Test();
			break;
		case 15:
			new thinking.paragraph05.InitialValues.Test();
			break;
		case 16:
			new thinking.paragraph05.InitialValues2.Test();
			break;
		case 17:
			new thinking.paragraph05.Measurement.Test();
			break;
		case 18:
			new thinking.paragraph05.MethodInit.Test();
			break;
		case 19:
			new thinking.paragraph05.OrderOfInitialization.Test();
			break;
		case 20:
			new thinking.paragraph05.StaticInitialization.Test();
			break;
		case 21:
			new thinking.paragraph05.ExplicitStatic.Test();
			break;
		case 22:
			new thinking.paragraph05.Mugs.Test();
			break;
		case 23:
			new thinking.paragraph05.ArraysOfPrimitives.Test();
			break;
		case 24:
			new thinking.paragraph05.ArrayNew.Test();
			break;
		case 25:
			new thinking.paragraph05.ArrayClassObj.Test();
			break;
		case 26:
			new thinking.paragraph05.ArrayInit.Test();
			break;
		case 27:
			new thinking.paragraph05.DynamicArray.Test();
			break;
		case 28:
			new thinking.paragraph05.VarArgs.Test();
			break;
		case 29:
			new thinking.paragraph05.NewVarArgs.Test();
			break;
		case 30:
			new thinking.paragraph05.OptionalTrailingArguments.Test();
			break;
		case 31:
			new thinking.paragraph05.VarargType.Test();
			break;
		case 32:
			new thinking.paragraph05.AutoboxingVarargs.Test();
			break;
		case 33:
			new thinking.paragraph05.OverloadingVarargs.Test();
			break;
		case 34:
			new thinking.paragraph05.OverloadingVarargs2.Test();
			break;
		case 35:
			new thinking.paragraph05.OverloadingVarargs3.Test();
			break;
		case 36:
			new thinking.paragraph05.SimpleEnumUse.Test();
			break;
		case 37:
			new thinking.paragraph05.EnumOrder.Test();
			break;
		case 38:
			new thinking.paragraph05.Burrito.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph6() {
		System.out.println("06.Access Control");
		System.out.println("*************************************");
		System.out.println("01.FullQualification		P110");
		System.out.println("02.SingleImport			P110");
		System.out.println("03.MyClass			P111");
		System.out.println("04.ImportMyClass		P111");
		System.out.println("05.LibTest			P113");
		System.out.println("06.PrintTest			P114");
		System.out.println("07.Cookie			P117");
		System.out.println("08.Dinner			P117");
		System.out.println("09.Cake				P117");
		System.out.println("10.IceCream			P118");
		System.out.println("11.ChocolateChip		P119");
		System.out.println("12.CookieProtected		P119");
		System.out.println("13.ChocolateChipProtected	P119");
		System.out.println("14.OrganizedByAccess		P120");
		System.out.println("15.Lunch			P122");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph06.FullQualification.Test();
			break;
		case 2:
			new thinking.paragraph06.SingleImport.Test();
			break;
		case 3:
			new thinking.paragraph06.MyClass.Test();
			break;
		case 4:
			new thinking.paragraph06.ImportMyClass.Test();
			break;
		case 5:
			new thinking.paragraph06.LibTest.Test();
			break;
		case 6:
			new thinking.paragraph06.PrintTest.Test();
			break;
		case 7:
			new thinking.paragraph06.Cookie.Test();
			break;
		case 8:
			new thinking.paragraph06.Dinner.Test();
			break;
		case 9:
			new thinking.paragraph06.Cake.Test();
			break;
		case 10:
			new thinking.paragraph06.IceCream.Test();
			break;
		case 11:
			new thinking.paragraph06.ChocolateChip.Test();
			break;
		case 12:
			new thinking.paragraph06.CookieProtected.Test();
			break;
		case 13:
			new thinking.paragraph06.ChocolateChipProtected.Test();
			break;
		case 14:
			new thinking.paragraph06.OrganizedByAccess.Test();
			break;
		case 15:
			new thinking.paragraph06.Lunch.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph7() {
		System.out.println("07.Reusing Classes");
		System.out.println("*************************************");
		System.out.println("01.SprinklerSystem		P125");
		System.out.println("02.Bath				P126");
		System.out.println("03.Detergent			P127");
		System.out.println("04.Cartoon			P129");
		System.out.println("05.Chess			P130");
		System.out.println("06.SpaceShipControls		P131");
		System.out.println("07.SpaceShipDelegation		P131");
		System.out.println("08.PlaceSetting			P132");
		System.out.println("09.CADSystem			P134");
		System.out.println("10.Hide				P136");
		System.out.println("11.Car				P137");
		System.out.println("12.Orc				P138");
		System.out.println("13.Wind				P139");
		System.out.println("14.FinalData			P140");
		System.out.println("15.BlankFinal			P142");
		System.out.println("16.FinalArguments		P142");
		System.out.println("17.FinalOverridingIllusion	P143");
		System.out.println("18.Beetle			P146");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph07.SprinklerSystem.Test();
			break;
		case 2:
			new thinking.paragraph07.Bath.Test();
			break;
		case 3:
			new thinking.paragraph07.Detergent.Test();
			break;
		case 4:
			new thinking.paragraph07.Cartoon.Test();
			break;
		case 5:
			new thinking.paragraph07.Chess.Test();
			break;
		case 6:
			new thinking.paragraph07.SpaceShipControls.Test();
			break;
		case 7:
			new thinking.paragraph07.SpaceShipDelegation.Test();
			break;
		case 8:
			new thinking.paragraph07.PlaceSetting.Test();
			break;
		case 9:
			new thinking.paragraph07.CADSystem.Test();
			break;
		case 10:
			new thinking.paragraph07.Hide.Test();
			break;
		case 11:
			new thinking.paragraph07.Car.Test();
			break;
		case 12:
			new thinking.paragraph07.Orc.Test();
			break;
		case 13:
			new thinking.paragraph07.Wind.Test();
			break;
		case 14:
			new thinking.paragraph07.FinalData.Test();
			break;
		case 15:
			new thinking.paragraph07.BlankFinal.Test();
			break;
		case 16:
			new thinking.paragraph07.FinalArguments.Test();
			break;
		case 17:
			new thinking.paragraph07.FinalOverridingIllusion.Test();
			break;
		case 18:
			new thinking.paragraph07.Beetle.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph8() {
		System.out.println("08.Polymorphism");
		System.out.println("*************************************");
		System.out.println("01.Music			P148");
		System.out.println("02.Music2			P149");
		System.out.println("03.Shape			P152");
		System.out.println("04.Music3			P154");
		System.out.println("05.PrivateOverride		P156");
		System.out.println("06.FieldAccess			P156");
		System.out.println("07.StaticPolymorphism		P157");
		System.out.println("08.Sandwich			P158");
		System.out.println("09.Frog				P159");
		System.out.println("10.ReferenceCounting		P161");
		System.out.println("11.PolyConstructors		P163");
		System.out.println("12.CovariantReturn		P164");
		System.out.println("13.Transmogrify			P165");
		System.out.println("14.RTTI				P167");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph08.Music.Test();
			break;
		case 2:
			new thinking.paragraph08.Music2.Test();
			break;
		case 3:
			new thinking.paragraph08.Shape.Test();
			break;
		case 4:
			new thinking.paragraph08.Music3.Test();
			break;
		case 5:
			new thinking.paragraph08.PrivateOverride.Test();
			break;
		case 6:
			new thinking.paragraph08.FieldAccess.Test();
			break;
		case 7:
			new thinking.paragraph08.StaticPolymorphism.Test();
			break;
		case 8:
			new thinking.paragraph08.Sandwich.Test();
			break;
		case 9:
			new thinking.paragraph08.Frog.Test();
			break;
		case 10:
			new thinking.paragraph08.ReferenceCounting.Test();
			break;
		case 11:
			new thinking.paragraph08.PolyConstructors.Test();
			break;
		case 12:
			new thinking.paragraph08.CovariantReturn.Test();
			break;
		case 13:
			new thinking.paragraph08.Transmogrify.Test();
			break;
		case 14:
			new thinking.paragraph08.RTTI.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph9() {
		System.out.println("09.Interfaces");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph10() {
		System.out.println("10.Inner Classes");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph11() {
		System.out.println("11.Holding Your Objects");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph12() {
		System.out.println("12.Error Handling with Exceptions");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph13() {
		System.out.println("13.Strings");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph14() {
		System.out.println("14.Type Information");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph15() {
		System.out.println("15.Generics");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph16() {
		System.out.println("16.Arrays");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph17() {
		System.out.println("17.Containers in Depth");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph18() {
		System.out.println("18.I/O");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph19() {
		System.out.println("19.Enumerated Types");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph20() {
		System.out.println("20.Annotations");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph21() {
		System.out.println("21.Concurrency");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraph22() {
		System.out.println("22.Graphical User Interfaces");
		System.out.println("*************************************");
		System.out.println("01.HelloDate			P30");
		System.out.println("02.ShowProperties		P31");
		System.out.println("*************************************");
		System.out.println();
		int keyProgram = readNumber("Please choose which program you want to run:");
		LoadParagraphStart();
		switch (keyProgram) {
		case 1:
			new thinking.paragraph02.HelloDate.Test();
			break;
		case 2:
			new thinking.paragraph02.ShowProperties.Test();
			break;
		default:
			LoadProgramWrong();
			return;
		}
		LoadProgramEnd();
	}

	private void LoadParagraphStart() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
	}

	private void LoadProgramEnd() {
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
	}

	private void LoadProgramWrong() {
		System.out.println();
		System.out.println();
		System.out.println("*************************************");
		System.out.println("**          Wrong number!          **");
		System.out.println("*************************************");
	}
}
