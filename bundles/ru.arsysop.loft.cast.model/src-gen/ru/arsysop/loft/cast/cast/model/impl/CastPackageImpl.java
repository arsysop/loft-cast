/**
 * Copyright (c) 2022 ArSysOp
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 	SPDX-License-Identifier: Apache-2.0
 * Contributors:
 * 	ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.loft.cast.cast.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.arsysop.loft.cast.cast.model.api.ClassTemplateDecl;
import ru.arsysop.loft.cast.cast.model.api.FunctionDecl;
import ru.arsysop.loft.cast.cast.model.api.NamedDecl;
import ru.arsysop.loft.cast.cast.model.api.NamespaceDecl;
import ru.arsysop.loft.cast.cast.model.api.TranslationUnitDecl;

import ru.arsysop.loft.cast.cast.model.meta.CastFactory;
import ru.arsysop.loft.cast.cast.model.meta.CastPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CastPackageImpl extends EPackageImpl implements CastPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationUnitDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTemplateDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.arsysop.loft.cast.cast.model.meta.CastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CastPackageImpl() {
		super(eNS_URI, CastFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CastPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CastPackage init() {
		if (isInited) return (CastPackage)EPackage.Registry.INSTANCE.getEPackage(CastPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCastPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CastPackageImpl theCastPackage = registeredCastPackage instanceof CastPackageImpl ? (CastPackageImpl)registeredCastPackage : new CastPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCastPackage.createPackageContents();

		// Initialize created meta-data
		theCastPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCastPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CastPackage.eNS_URI, theCastPackage);
		return theCastPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedDecl() {
		return namedDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedDecl_Id() {
		return (EAttribute)namedDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedDecl_Name() {
		return (EAttribute)namedDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTranslationUnitDecl() {
		return translationUnitDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTranslationUnitDecl_Declarations() {
		return (EReference)translationUnitDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespaceDecl() {
		return namespaceDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespaceDecl_Declarations() {
		return (EReference)namespaceDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassTemplateDecl() {
		return classTemplateDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassTemplateDecl_Methods() {
		return (EReference)classTemplateDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionDecl() {
		return functionDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastFactory getCastFactory() {
		return (CastFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedDeclEClass = createEClass(NAMED_DECL);
		createEAttribute(namedDeclEClass, NAMED_DECL__ID);
		createEAttribute(namedDeclEClass, NAMED_DECL__NAME);

		translationUnitDeclEClass = createEClass(TRANSLATION_UNIT_DECL);
		createEReference(translationUnitDeclEClass, TRANSLATION_UNIT_DECL__DECLARATIONS);

		namespaceDeclEClass = createEClass(NAMESPACE_DECL);
		createEReference(namespaceDeclEClass, NAMESPACE_DECL__DECLARATIONS);

		classTemplateDeclEClass = createEClass(CLASS_TEMPLATE_DECL);
		createEReference(classTemplateDeclEClass, CLASS_TEMPLATE_DECL__METHODS);

		functionDeclEClass = createEClass(FUNCTION_DECL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		translationUnitDeclEClass.getESuperTypes().add(this.getNamedDecl());
		namespaceDeclEClass.getESuperTypes().add(this.getNamedDecl());
		classTemplateDeclEClass.getESuperTypes().add(this.getNamedDecl());
		functionDeclEClass.getESuperTypes().add(this.getNamedDecl());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedDeclEClass, NamedDecl.class, "NamedDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNamedDecl_Id(), ecorePackage.getEString(), "id", null, 1, 1, NamedDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getNamedDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(translationUnitDeclEClass, TranslationUnitDecl.class, "TranslationUnitDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTranslationUnitDecl_Declarations(), this.getNamedDecl(), null, "declarations", null, 0, -1, TranslationUnitDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(namespaceDeclEClass, NamespaceDecl.class, "NamespaceDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNamespaceDecl_Declarations(), this.getNamedDecl(), null, "declarations", null, 0, -1, NamespaceDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(classTemplateDeclEClass, ClassTemplateDecl.class, "ClassTemplateDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClassTemplateDecl_Methods(), this.getFunctionDecl(), null, "methods", null, 0, -1, ClassTemplateDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //CastPackageImpl
